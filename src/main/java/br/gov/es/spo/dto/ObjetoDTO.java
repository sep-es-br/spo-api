package br.gov.es.spo.dto;

import br.gov.es.spo.model.Objeto;
import br.gov.es.spo.model.UnidadeOrcamentaria;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ObjetoDTO {
    
    private String unidadeResponsavel;
    private String nome;
    private String tipo;
    private Double totalPrevisto;
    private Double totalHomologado;
    private Double totalOrcado;
    private Double totalAutorizado;
    private Double totalDisponivel;

    public ObjetoDTO(Objeto objeto) {

        this.nome = objeto.getNome();
        this.tipo = objeto.getTipo();
        UnidadeOrcamentaria unidade = objeto.getCustosEstimadores().get(0).getUnidadeOrcamentariaInformadora();
        this.unidadeResponsavel = unidade.getCodigo() + " - " + unidade.getSigla();

        this.totalPrevisto = 0d;
        this.totalHomologado = 0d;
        this.totalOrcado = 0d;
        this.totalAutorizado = 0d;
        this.totalDisponivel = 0d;

        objeto.getCustosEstimadores().forEach(custo -> {
            this.totalPrevisto += custo.getPrevisto();
            this.totalHomologado += custo.getContratado();
        });

        objeto.getContaCusteada().getExecucoesOrcamentariaDelimitadores().forEach(exec -> {
            this.totalOrcado += exec.getOrcamento();
            this.totalAutorizado += exec.getAutorizado();
            this.totalDisponivel += 0;
        });
    }
}

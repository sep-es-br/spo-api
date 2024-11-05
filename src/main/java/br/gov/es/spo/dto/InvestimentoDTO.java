package br.gov.es.spo.dto;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InvestimentoDTO {

    private String nome;
    private String codPO;
    private Double totalPrevisto;
    private Double totalHomologado;
    private Double totalOrcado;

    private List<ObjetoDTO> objetos;
    
    public InvestimentoDTO(Investimento investimento){
        
        this.nome = investimento.getNome();
        this.codPO = investimento.getExecucoesOrcamentariaDelimitadores().get(0).getPlanoOrcamentarioOrientador().getCodigo().toString();

        this.objetos = investimento.getObjetosCusteadores().stream().map(objeto -> {
            return new ObjetoDTO(objeto);
        }).collect(Collectors.toList());

    }
}
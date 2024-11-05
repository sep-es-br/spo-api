package br.gov.es.spo.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UnidadeOrcamentaria {
    
    private Long codigo;
    private String sigla;
    private String nome;

    private ArrayList<PlanoOrcamentario> planosOrcamentariosControlados = new ArrayList<>();
    private ArrayList<ExecucaoOrcamentaria> execucaoOrcamentariasImplementadas = new ArrayList<>();

    public UnidadeOrcamentaria(Long codigo, String sigla, List<PlanoOrcamentario> planoOrcamentarios, List<ExecucaoOrcamentaria> execucoes) {
        this.codigo = codigo;
        this.sigla = sigla;
        planoOrcamentarios.forEach(this::addPlanosOrcamentariosControlados);
        execucoes.forEach(this::addExecucaoOrcamentariasImplementadas);
    }

    public void addExecucaoOrcamentariasImplementadas(ExecucaoOrcamentaria execucaoOrcamentaria) {
        execucaoOrcamentaria.setUnidadeOrcamentariaImplementadora(this);
        this.getExecucaoOrcamentariasImplementadas().add(execucaoOrcamentaria);
    }

    public void addPlanosOrcamentariosControlados(PlanoOrcamentario planoOrcamentario) {
        planoOrcamentario.getUnidadesOrcamentariaControladoras().add(this);
        this.getPlanosOrcamentariosControlados().add(planoOrcamentario);
    }
}

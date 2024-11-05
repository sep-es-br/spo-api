package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlanoOrcamentario implements Serializable{
    
    private Long codigo;
    private String nome;
    private String descricao;

    private ArrayList<ExecucaoOrcamentaria> execucoesOrcamentariaOrientadas = new ArrayList<>();
    private ArrayList<UnidadeOrcamentaria> unidadesOrcamentariaControladoras = new ArrayList<>();

    public PlanoOrcamentario(Long codigo, String nome, List<ExecucaoOrcamentaria> execucoes) {
        this.codigo = codigo;
        this.nome = nome;
        execucoes.forEach(this::addExecucaoOrcamentariaOrientada);
    }

    public void addExecucaoOrcamentariaOrientada(ExecucaoOrcamentaria execucaoOrcamentaria) {
        execucaoOrcamentaria.setPlanoOrcamentarioOrientador(this);
        this.getExecucoesOrcamentariaOrientadas().add(execucaoOrcamentaria);
    }

}

package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FonteOrcamentaria implements Serializable {

    private Long codigo;
    private String nome;
    private String descricao;

    private ArrayList<Custo> custosIndicados = new ArrayList<>();
    private ArrayList<ExecucaoOrcamentaria> execucoesOrcamentariaVinculadas = new ArrayList<>();

    

    public FonteOrcamentaria(String nome) {
        this.nome = nome;
    }

    public FonteOrcamentaria(String nome, List<Custo> custos, List<ExecucaoOrcamentaria> execucoes) {
        this.nome = nome;
        custos.forEach(this::addCustoIndicado);
        execucoes.forEach(this::addExecucoesOrcamentariaVinculadas);
    }

    public void addCustoIndicado(Custo custo) {
        custo.setFonteOrcamentariaIndicadora(this);
        this.custosIndicados.add(custo);
    }

    public void addExecucoesOrcamentariaVinculadas(ExecucaoOrcamentaria execucaoOrcamentaria) {
        execucaoOrcamentaria.setFonteOrcamentariaVinculadora(this);
        this.execucoesOrcamentariaVinculadas.add(execucaoOrcamentaria);
    }
}
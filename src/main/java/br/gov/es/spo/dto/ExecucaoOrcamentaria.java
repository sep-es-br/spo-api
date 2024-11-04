package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExecucaoOrcamentaria extends Entidade implements Serializable {
    
    private String anoExercicio;
    private double orcamento;
    private double autorizado;
    private double[] liquidado;

    private Conta contaDelimitada;
    private FonteOrcamentaria fonteOrcamentariaVinculadora;
    private PlanoOrcamentario planoOrcamentarioOrientador;
    private UnidadeOrcamentaria unidadeOrcamentariaImplementadora;

    public ExecucaoOrcamentaria(String ano, double orcamento, double autorizado, double[] liquidado, Conta contaDelimitada) {
        this.anoExercicio = ano;
        this.orcamento = orcamento;
        this.autorizado = autorizado;
        this.liquidado = liquidado == null ? new double[12] : liquidado;
        this.setContaDelimitada(contaDelimitada);
    }

    public void setContaDelimitada(Conta conta) {
        conta.getExecucoesOrcamentariaDelimitadores().add(this);
        this.contaDelimitada = conta;
    }

}

package br.gov.es.spo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExecucaoOrcamentaria extends Entidade implements Serializable {
    
    private String anoExercicio;
    private double orcamento;
    private double autorizado;
    private double[] liquidado;

    private Conta conta;
    private FonteOrcamentaria fonteOrcamentaria;
}

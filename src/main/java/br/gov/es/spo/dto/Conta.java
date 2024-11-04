package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta extends Entidade implements Serializable {
    private String status;
    private String nome;

    private List<Objeto> objetosCusteadores;
    private List<ExecucaoOrcamentaria> execucoesOrcamentariaDelimitadores;

}

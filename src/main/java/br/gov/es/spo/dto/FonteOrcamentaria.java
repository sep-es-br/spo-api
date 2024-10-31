package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FonteOrcamentaria implements Serializable {

    private Long codigo;
    private String nome;
    private String descricao;

    private List<Custo> custos;
    
}
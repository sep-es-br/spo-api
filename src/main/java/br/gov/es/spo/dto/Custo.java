package br.gov.es.spo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Custo extends Entidade implements Serializable {
     
    private String anoExercicio;
    private double previsto;
    private double contratado;

    private Objeto objeto;
    private FonteOrcamentaria fonteOrcamentaria;

}

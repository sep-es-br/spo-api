package br.gov.es.spo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Custo extends Entidade implements Serializable {
     
    private String anoExercicio;
    private double previsto;
    private double contratado;

    private Objeto objetoEstimado;
    private FonteOrcamentaria fonteOrcamentariaIndicadora;

    public Custo(String anoExercicio, double previsto, double contratado, Objeto objetoEstimado) {
        this.anoExercicio = anoExercicio;
        this.previsto = previsto;
        this.contratado = contratado;
        this.setObjetoEstimado(objetoEstimado);
    }

    public void setObjetoEstimado(Objeto objeto) {
        objeto.getCustosEstimadores().add(this);
        this.objetoEstimado = objeto;
    }
}

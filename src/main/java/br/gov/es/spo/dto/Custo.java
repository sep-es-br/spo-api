package br.gov.es.spo.dto;

import java.io.Serializable;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Node
public class Custo extends Entidade implements Serializable {
     
    private String anoExercicio;
    private double previsto;
    private double contratado;

    @Relationship(type = "ESTIMADO", direction = Direction.OUTGOING)
    private Objeto objetoEstimado;

    @Relationship(type = "INDICADA", direction = Direction.INCOMING)
    private FonteOrcamentaria fonteOrcamentariaIndicadora;

    @Relationship(type = "INFORMA", direction = Direction.INCOMING)
    private UnidadeOrcamentaria unidadeOrcamentariaInformadora;

    public Custo(String anoExercicio, double previsto, double contratado, Objeto objetoEstimado) {
        this.anoExercicio = anoExercicio;
        this.previsto = previsto;
        this.contratado = contratado;
        this.setObjetoEstimado(objetoEstimado);
    }


    public static Custo criar(String ano, UnidadeOrcamentaria unidade, Objeto objeto){
        
    }

}

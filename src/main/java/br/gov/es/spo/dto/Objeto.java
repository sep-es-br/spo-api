package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Node
public class Objeto extends Entidade implements Serializable {
    
    private String nome;
    private String descricao;
    private String tipo;
    private int openPMOId;
    private String status;

    @Relationship(type = "CUSTEADO", direction = Direction.OUTGOING)
    private Conta contaCusteada;

    @Relationship(type = "ESTIMADO", direction = Direction.INCOMING)
    private ArrayList<Custo> custosEstimadores = new ArrayList<>();

    public Objeto(String nome, String tipo, Conta contaCusteada) {
        this.nome = nome;
        this.tipo = tipo;
        this.contaCusteada = contaCusteada;
    }

}

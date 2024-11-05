package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Node
public class Conta extends Entidade implements Serializable {
    private String status;
    private String nome;

    @Relationship(type = "CUSTEADO", direction = Direction.INCOMING)
    private ArrayList<Objeto> objetosCusteadores = new ArrayList<>();

    @Relationship(type = "DELIMITA", direction = Direction.INCOMING)
    private ArrayList<ExecucaoOrcamentaria> execucoesOrcamentariaDelimitadores = new ArrayList<>();

}

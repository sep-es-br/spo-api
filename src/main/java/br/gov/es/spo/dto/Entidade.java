package br.gov.es.spo.dto;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Node
public abstract class Entidade {

    @Id @GeneratedValue
    private Long id;

      
    
}

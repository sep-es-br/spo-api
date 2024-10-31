package br.gov.es.spo.dto;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Entidade {

    @Id @GeneratedValue
    private Long id;

      
    
}

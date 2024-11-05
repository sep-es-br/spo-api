package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.Objeto;

public interface ObjetoRepository extends Neo4jRepository<Objeto, Long> {
    
}

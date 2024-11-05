package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.PlanoOrcamentario;

public interface PlanoOrcamentarioRepository extends Neo4jRepository<PlanoOrcamentario, Long> {
    
}

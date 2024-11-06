package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.UnidadeOrcamentaria;

public interface UnidadeOrcamentariaRepository extends Neo4jRepository<UnidadeOrcamentaria, String> {
    
}

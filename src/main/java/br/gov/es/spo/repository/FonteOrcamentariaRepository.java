package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.FonteOrcamentaria;

public interface FonteOrcamentariaRepository extends Neo4jRepository<FonteOrcamentaria, String>{
    
}

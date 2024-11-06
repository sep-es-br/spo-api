package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.ExecucaoOrcamentaria;

public interface ExecucaoOrcamentariaRepository extends Neo4jRepository<ExecucaoOrcamentaria, Long> {
    
}
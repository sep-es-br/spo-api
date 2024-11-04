package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.Conta;

public interface ContaRepository extends Neo4jRepository<Conta, Long> {
    
}

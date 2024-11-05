package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.Investimento;

public interface InvestimentoRepository extends Neo4jRepository<Investimento, Long> {

    
} 

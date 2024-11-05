package br.gov.es.spo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import br.gov.es.spo.dto.Custo;

public interface CustoRepository extends Neo4jRepository<Custo, Long> {
    
}

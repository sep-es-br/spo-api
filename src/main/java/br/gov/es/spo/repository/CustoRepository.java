package br.gov.es.spo.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import br.gov.es.spo.dto.Custo;

public interface CustoRepository extends Neo4jRepository<Custo, Long> {
    
    @Query("MATCH (c:Custo) WHERE ($exercicio = \"undefined\" OR  c.anoExercicio = $exercicio) RETURN c\r\n")
    public List<Custo> findByExercicio(String exercicio);
}

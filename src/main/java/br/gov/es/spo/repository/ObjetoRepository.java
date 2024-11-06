package br.gov.es.spo.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import br.gov.es.spo.dto.Objeto;

public interface ObjetoRepository extends Neo4jRepository<Objeto, String> {
    

    @Query("MATCH (conta:Conta)<-[rc:CUSTEADO]-(obj:Objeto)<-[re:ESTIMADO]-(custo:Custo)<-[ri:INFORMA]-(unidade:UnidadeOrcamentaria)\r\n" + //
                "  WHERE ($nome IS NULL OR toUpper(obj.nome) CONTAINS toUpper($nome))\r\n" + //
                "    AND ($execicio IS NULL OR custo.anoExercicio = $execicio)\r\n" + //
                "  RETURN obj, collect(re), collect(custo), collect(ri), collect(unidade), collect(rc), collect(conta)")
    public List<Objeto> getAllByFilter(String execicio, String nome); 
}

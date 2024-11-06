package br.gov.es.spo.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import br.gov.es.spo.dto.Investimento;

public interface InvestimentoRepository extends  Neo4jRepository<Investimento, Long> {

    @Query("MATCH" + 
                "    (conta:Investimento)<-[rc:CUSTEADO]-(obj:Objeto)<-[re:ESTIMADO]-(custo:Custo)<-[ri:INFORMA]-(unidade:UnidadeOrcamentaria)," + 
                "    (conta)<-[rd:DELIMITA]-(exec:ExecucaoOrcamentaria)<-[ro:ORIENTA]-(plano:PlanoOrcamentario) " + 
                "RETURN conta, collect(rc), collect(obj), collect(re), collect(custo), collect(ri), collect(unidade)," + 
                "    collect(rd), collect(exec), collect(ro), collect(plano)")
    public List<Investimento> findAllByFilter();

    
    
} 

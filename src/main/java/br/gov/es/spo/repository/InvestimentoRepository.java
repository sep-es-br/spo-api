package br.gov.es.spo.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import br.gov.es.spo.dto.Investimento;

public interface InvestimentoRepository extends  Neo4jRepository<Investimento, Long> {

    @Query("MATCH " + 
                "    (conta:Investimento)<-[rc:CUSTEADO]-(obj:Objeto)<-[re:ESTIMADO]-(custo:Custo)<-[ri:INFORMA]-(unidade:UnidadeOrcamentaria), " + 
                "    (conta)<-[rd:DELIMITA]-(exec:ExecucaoOrcamentaria)<-[ro:ORIENTA]-(plano:PlanoOrcamentario) " + 
                "WHERE ($exercicio IS null OR exec.anoExercicio = $exercicio OR custo.anoExercicio = $exercicio) " + 
                "    AND ($nome IS NULL OR toUpper(conta.nome) contains toUpper($nome) OR toUpper(obj.nome) contains toUpper($nome)) " + 
                "    AND ($idPo IS NULL OR id(plano) = $idPo) " + 
                "    AND ($idUnidade IS NULL OR id(unidade) = $idUnidade) " + 
                "RETURN conta, collect(rc), collect(obj), collect(re), collect(custo), collect(ri), collect(unidade), " + 
                "    collect(rd), collect(exec), collect(ro), collect(plano)")
    public List<Investimento> findAllByFilter(String nome, String exercicio, Long idPo, Long idUnidade);

    
    
} 
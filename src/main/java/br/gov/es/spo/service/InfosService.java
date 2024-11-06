package br.gov.es.spo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.spo.dto.Custo;
import br.gov.es.spo.dto.ExecucaoOrcamentaria;
import br.gov.es.spo.dto.PlanoOrcamentario;
import br.gov.es.spo.repository.CustoRepository;
import br.gov.es.spo.repository.ExecucaoOrcamentariaRepository;
import br.gov.es.spo.repository.PlanoOrcamentarioRepository;

@Service
public class InfosService {
    

    @Autowired
    private CustoRepository custoRepository;

    @Autowired
    private ExecucaoOrcamentariaRepository execucaoRepository;

    @Autowired
    private PlanoOrcamentarioRepository planoRepository;

    public List<String> getAllAnos() {

        List<Custo> custos = custoRepository.findAll();
        List<ExecucaoOrcamentaria> execucoes = execucaoRepository.findAll();

        List<String> anosCusto = custos.stream().map(custo -> custo.getAnoExercicio()).toList();
        List<String> anosExec = execucoes.stream().map(exec -> exec.getAnoExercicio()).toList();
        
        Set<String> anosCustoSet = new HashSet<>(anosCusto);
        Set<String> anosExecSet = new HashSet<>(anosExec);

        HashSet<String> todosAnos = new HashSet<>(anosCustoSet);
        todosAnos.addAll(anosExecSet);

        return todosAnos.stream().sorted((s1, s2) -> s1.compareTo(s2)).toList();
    }





}

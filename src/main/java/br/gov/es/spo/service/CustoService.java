package br.gov.es.spo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.spo.exception.BatataException;
import br.gov.es.spo.model.Custo;
import br.gov.es.spo.model.DataMock;
import br.gov.es.spo.model.ExecucaoOrcamentaria;
import br.gov.es.spo.repository.CustoRepository;

@Service
public class CustoService {
    
    @Autowired
    private CustoRepository repository;

    private ObjetoService objetoService;

    public void saveAll(List<Custo> custos) {
        repository.saveAll(custos);
    }

    public List<Custo> getAllByExercicio(String exercicio){
        return repository.findByExercicio(exercicio);
    }

    public void hidratarObjetoEstimado(Custo custo) {
        custo.setObjetoEstimado(this.objetoService.getByCusto(custo));
    }

    public double totalPrevisto(String exercicio){

        double totalPrevisto = 0;

        List<Custo> custosAno = repository.findByExercicio(exercicio);

        for (Custo custo : custosAno) {
            totalPrevisto += custo.getPrevisto();
        }
        
        return totalPrevisto;

    }

    public double totalHomologado(String exercicio){

        double totalPrevisto = 0;

        List<Custo> custosAno = repository.findByExercicio(exercicio);

        for (Custo custo : custosAno) {
            totalPrevisto += custo.getContratado();
        }
        
        return totalPrevisto;

    }

    public double totalAutorizado(){

        double totalAutorizado = 0;

        List<ExecucaoOrcamentaria> ExecsAno = DataMock.noExecucaoOrcamentarias.stream()
                .filter(custo -> custo.getAnoExercicio().equals("2025"))
                .collect(Collectors.toList());

        for (ExecucaoOrcamentaria custo : ExecsAno) {
            totalAutorizado += custo.getAutorizado();
        }
        
        return totalAutorizado;

    }

    public double totalDisponivel(){

        double totalDisponivel = 0;

        List<ExecucaoOrcamentaria> ExecsAno = DataMock.noExecucaoOrcamentarias.stream()
                .filter(custo -> custo.getAnoExercicio().equals("2025"))
                .collect(Collectors.toList());

        // for (ExecucaoOrcamentaria custo : ExecsAno) {
        //     totalDisponivel += custo.getAutorizado();
        // }
        
        return totalDisponivel;

    }
    

}
package br.gov.es.spo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.gov.es.spo.dto.Custo;
import br.gov.es.spo.dto.DataMock;
import br.gov.es.spo.dto.ExecucaoOrcamentaria;

@Service
public class CustoService {
    

    public double totalPrevisto(){

        double totalPrevisto = 0;

        List<Custo> custosAno = DataMock.noCustos.stream()
                .filter(custo -> custo.getAnoExercicio().equals("2025"))
                .collect(Collectors.toList());

        for (Custo custo : custosAno) {
            totalPrevisto += custo.getPrevisto();
        }
        
        return totalPrevisto;

    }

    public double totalHomologado(){

        double totalPrevisto = 0;

        List<Custo> custosAno = DataMock.noCustos.stream()
                .filter(custo -> custo.getAnoExercicio().equals("2025"))
                .collect(Collectors.toList());

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
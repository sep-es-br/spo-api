package br.gov.es.spo.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.spo.dto.Custo;
import br.gov.es.spo.dto.DataMock;
import br.gov.es.spo.dto.ExecucaoOrcamentaria;
import br.gov.es.spo.dto.FonteOrcamentaria;
import br.gov.es.spo.dto.Investimento;
import br.gov.es.spo.dto.Objeto;
import br.gov.es.spo.dto.PlanoOrcamentario;
import br.gov.es.spo.dto.UnidadeOrcamentaria;
import br.gov.es.spo.service.CustoService;
import br.gov.es.spo.service.ExecucaoOrcamentariaService;
import br.gov.es.spo.service.FonteOrcamentariaService;
import br.gov.es.spo.service.InvestimentoService;
import br.gov.es.spo.service.ObjetoService;
import br.gov.es.spo.service.PlanoOrcamentarioService;
import br.gov.es.spo.service.UnidadeOrcamentariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin(origins = "${frontend.host}")
@RequestMapping("/controler")
@RequiredArgsConstructor
public class ControleMasterController {

    private final CustoService custoService;
    private final ObjetoService objetoService;
    private final InvestimentoService investimentoService;
    private final ExecucaoOrcamentariaService execucaoOrcamentariaService;
    private final PlanoOrcamentarioService planoOrcamentarioService;
    private final UnidadeOrcamentariaService unidadeOrcamentariaService;
    private final FonteOrcamentariaService fonteOrcamentariaService;

    @PutMapping("gerarDB")
    public ResponseEntity<String> putMethodName() {
        
        if(DataMock.populado) return ResponseEntity.ok("Concluido previamente");

        DataMock.popular2();

        // custoService.saveAll(DataMock.noCustos);
        // objetoService.saveAll(DataMock.noObjetos);
        // investimentoService.saveAll(DataMock.noInvestimentos);
        // unidadeOrcamentariaService.saveAll(DataMock.noUnidadeOrcamentarias);
        // planoOrcamentarioService.saveAll(DataMock.noPlanoOrcamentarios);
        execucaoOrcamentariaService.saveAll(DataMock.noExecucaoOrcamentarias);
        // fonteOrcamentariaService.saveAll(DataMock.noFonteOrcamentarias);
        

        return ResponseEntity.ok("Concluido");
    }
}

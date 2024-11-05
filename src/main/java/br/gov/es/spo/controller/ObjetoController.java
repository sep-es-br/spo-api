package br.gov.es.spo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.spo.dto.InvestimentoDTO;
import br.gov.es.spo.dto.Objeto;
import br.gov.es.spo.dto.ObjetoDTO;
import br.gov.es.spo.service.InvestimentoService;
import br.gov.es.spo.service.ObjetoService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "${frontend.host}")
@RestController
@RequestMapping("/objeto")
@RequiredArgsConstructor
public class ObjetoController {

    @Value("${frontend.host}")
    private String frontHost;

    private final ObjetoService service;

    @GetMapping("/all")
    public ResponseEntity<List<ObjetoDTO>> getTotalPrevisto() {
        List<ObjetoDTO> investimentosDTO = service.getAll().stream().map(obj -> new ObjetoDTO(obj)).toList();

        return ResponseEntity.ok(investimentosDTO);
    }
    
}

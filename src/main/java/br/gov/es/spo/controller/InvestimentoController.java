package br.gov.es.spo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.spo.dto.InvestimentoDTO;
import br.gov.es.spo.service.CustoService;
import br.gov.es.spo.service.InvestimentoService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "${frontend.host}")
@RestController
@RequestMapping("/investimento")
@RequiredArgsConstructor
public class InvestimentoController {

    @Value("${frontend.host}")
    private String frontHost;

    private final InvestimentoService service;

    @GetMapping("/all")
    public ResponseEntity<List<InvestimentoDTO>> getTotalPrevisto(@RequestParam(required = false) String filtroJson) {
        List<InvestimentoDTO> investimentosDTO = service.getAll().stream().map(inv -> new InvestimentoDTO(inv)).toList();

        return ResponseEntity.ok(investimentosDTO);
    }
    
}

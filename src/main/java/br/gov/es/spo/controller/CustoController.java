package br.gov.es.spo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.spo.service.CustoService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "${frontend.host}")
@RestController
@RequestMapping("/custo")
@RequiredArgsConstructor
public class CustoController {

    @Value("${frontend.host}")
    private String frontHost;

    private final CustoService service;

    @GetMapping("/totalPrevisto")
    public ResponseEntity<Double> getTotalPrevisto() {
        double totalPrevisto = service.totalPrevisto();

        return ResponseEntity.ok(totalPrevisto);
    }
    
    @GetMapping("/totalHomologado")
    public ResponseEntity<Double> getTotalHomologado() {
        double totalHomologado = service.totalHomologado();

        return ResponseEntity.ok(totalHomologado);
    }
    
    @GetMapping("/totalAutorizado")
    public ResponseEntity<Double> getTotalAutorizado() {
        double totalAutorizado = service.totalAutorizado();

        return ResponseEntity.ok(totalAutorizado);
    }    
    
    @GetMapping("/totalDisponivel")
    public ResponseEntity<Double> getTotalDisponivel() {
        double totalDisponivel = service.totalDisponivel();

        return ResponseEntity.ok(totalDisponivel);
    }

    
}

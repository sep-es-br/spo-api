package br.gov.es.spo.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.gov.es.spo.dto.ObjetoDTO;
import br.gov.es.spo.dto.ObjetoFiltroDTO;
import br.gov.es.spo.service.InfosService;
import br.gov.es.spo.service.ObjetoService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "${frontend.host}")
@RestController
@RequestMapping("/infos")
@RequiredArgsConstructor
public class InfosController {

    @Value("${frontend.host}")
    private String frontHost;

    private final Logger logger = Logger.getLogger("ObjetoController");

    private final InfosService service;

    @GetMapping("/allAnos")
    public ResponseEntity<List<String>> getTodosAnos() {

        return ResponseEntity.ok(service.getAllAnos());

    }
    
}


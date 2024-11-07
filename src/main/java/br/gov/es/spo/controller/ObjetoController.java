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

import br.gov.es.spo.dto.InvestimentoDTO;
import br.gov.es.spo.dto.ObjetoDTO;
import br.gov.es.spo.dto.ObjetoFiltroDTO;
import br.gov.es.spo.model.Objeto;
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

    private final Logger logger = Logger.getLogger("ObjetoController");

    private final ObjetoService service;

    @GetMapping("/all")
    public ResponseEntity<List<ObjetoDTO>> getAllByFiltro(@RequestParam String filtroJson) {

        try{
            ObjetoFiltroDTO filtroDTO = new ObjectMapper().readValue(filtroJson, ObjetoFiltroDTO.class);

            List<ObjetoDTO> objetosDTO = service.getAllByFilter(filtroDTO).stream().map(obj -> new ObjetoDTO(obj)).toList();

            return ResponseEntity.ok(objetosDTO);
        } catch(Exception e){
            logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
            return ResponseEntity.internalServerError().build();
        }

    }
    
}

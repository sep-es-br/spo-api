package br.gov.es.spo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.spo.dto.PlanoOrcamentario;
import br.gov.es.spo.repository.PlanoOrcamentarioRepository;

@Service
public class PlanoOrcamentarioService {

    @Autowired
    private PlanoOrcamentarioRepository repository;

    public void saveAll(List<PlanoOrcamentario> planos) {
        repository.saveAll(planos);
    }

}

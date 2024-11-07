package br.gov.es.spo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.spo.model.UnidadeOrcamentaria;
import br.gov.es.spo.repository.UnidadeOrcamentariaRepository;

@Service
public class UnidadeOrcamentariaService {
    
    @Autowired
    private UnidadeOrcamentariaRepository repository;

    public void saveAll(List<UnidadeOrcamentaria> unidades) {
        repository.saveAll(unidades);
    }

    public List<UnidadeOrcamentaria> getAll() {
        return repository.findAll();
    }

}

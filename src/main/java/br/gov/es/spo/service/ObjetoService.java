package br.gov.es.spo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.spo.dto.DataMock;
import br.gov.es.spo.dto.Objeto;
import br.gov.es.spo.dto.ObjetoFiltroDTO;
import br.gov.es.spo.repository.ObjetoRepository;

@Service
public class ObjetoService {
    
    @Autowired
    private ObjetoRepository repository;

    public void saveAll(List<Objeto> objetos) {
        repository.saveAll(objetos);
    }

    public List<Objeto> getAllByFilter(ObjetoFiltroDTO filtroDTO) {
        return repository.getAllByFilter(filtroDTO.getExercicio(), filtroDTO.getNome());
    }
}

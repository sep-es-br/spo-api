package br.gov.es.spo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.spo.dto.ObjetoFiltroDTO;
import br.gov.es.spo.model.Custo;
import br.gov.es.spo.model.Objeto;
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

    public Objeto getByCusto(Custo custo){
        return repository.getByCusto(custo.getId());
    }

    public Optional<Objeto> getById(String id) {
        return repository.findById(id);
    }

    public List<Objeto> getAllByIds(List<String> ids) {
        return repository.findAllById(ids);
    }
}

package br.gov.es.spo.service;

import org.springframework.stereotype.Service;

import br.gov.es.spo.dto.DataMock;

@Service
public class InvestimentoService {
    

    public InvestimentoService(){
        DataMock.popularMock();
    }

}

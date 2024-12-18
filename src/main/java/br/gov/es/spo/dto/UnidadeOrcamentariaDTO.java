package br.gov.es.spo.dto;

import br.gov.es.spo.model.UnidadeOrcamentaria;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UnidadeOrcamentariaDTO {
    
    private String id;
    private String sigla;


    public UnidadeOrcamentariaDTO(UnidadeOrcamentaria unidade) {
        this.id = unidade.getId() ;
        this.sigla = unidade.getSigla();
    }

}

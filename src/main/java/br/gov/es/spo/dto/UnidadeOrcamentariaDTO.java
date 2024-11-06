package br.gov.es.spo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UnidadeOrcamentariaDTO {
    
    private Long id;
    private String sigla;


    public UnidadeOrcamentariaDTO(UnidadeOrcamentaria unidade) {
        this.id = unidade.getId();
        this.sigla = unidade.getSigla();
    }

}

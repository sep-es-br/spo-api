package br.gov.es.spo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ObjetoDTO {
    
    private String unidadeResponsavel;
    private String nome;
    private String tipo;
    private String totalPrevisto;
    private String totalHomologado;
    private String totalOrcado;

    public ObjetoDTO(Objeto objeto) {
        
    }
}

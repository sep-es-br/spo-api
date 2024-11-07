package br.gov.es.spo.dto;

import br.gov.es.spo.model.PlanoOrcamentario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlanoOrcamentarioDTO  {
    
    private String id;
    private Long cod;
    
    public PlanoOrcamentarioDTO (PlanoOrcamentario plano){
        this.id = plano.getId() ;
        this.cod = plano.getCodigo();
    }
    

}

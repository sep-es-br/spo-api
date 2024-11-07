package br.gov.es.spo.dto;

import java.io.Serializable;

import br.gov.es.spo.model.Custo;
import br.gov.es.spo.model.FonteOrcamentaria;
import br.gov.es.spo.model.Objeto;
import br.gov.es.spo.model.UnidadeOrcamentaria;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustoDTO implements Serializable {
    
    private String id;
    private String anoExercicio;
    private double previsto;
    private double contratado;

    private Objeto objetoEstimado;
    private FonteOrcamentaria fonteOrcamentariaIndicadora;
    private UnidadeOrcamentaria unidadeOrcamentariaInformadora;

    public CustoDTO(Custo custo) {
        this.id = custo.getId();
        this.anoExercicio = custo.getAnoExercicio();
        this.previsto = custo.getPrevisto();
        this.contratado = custo.getContratado();

        this.objetoEstimado = custo.getObjetoEstimado();
        this.fonteOrcamentariaIndicadora = custo.getFonteOrcamentariaIndicadora();
        this.unidadeOrcamentariaInformadora = custo.getUnidadeOrcamentariaInformadora();

    }

}

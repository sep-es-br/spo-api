package br.gov.es.spo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InvestimentoFiltroDTO {
    private String nome;
    private String codUnidade;
    private String codPO;
    private String exercicio;
}

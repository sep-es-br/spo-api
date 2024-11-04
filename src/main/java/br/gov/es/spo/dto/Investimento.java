package br.gov.es.spo.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Investimento extends Conta{
    
    public Investimento(String nome) {
        super.setNome(nome);
    }

}

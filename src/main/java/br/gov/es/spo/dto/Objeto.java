package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Objeto extends Entidade implements Serializable {
    
    private String nome;
    private String descricao;
    private String tipo;
    private int openPMOId;
    private String status;

    private Conta contaCusteada;
    private ArrayList<Custo> custosEstimadores = new ArrayList<>();

    public Objeto(String nome, String tipo, Conta contaCusteada) {
        this.nome = nome;
        this.tipo = tipo;
        this.setContaCusteada(contaCusteada);
    }

    public void setContaCusteada(Conta conta){
        conta.getObjetosCusteadores().add(this);
        this.contaCusteada = conta;
    }

}

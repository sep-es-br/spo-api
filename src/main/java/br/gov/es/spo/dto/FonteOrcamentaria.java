package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Node
public class FonteOrcamentaria implements Serializable {

    @Id
    private Long codigo;
    private String nome;
    private String descricao;

    @Relationship(type = "INDICADA", direction = Direction.OUTGOING)
    private ArrayList<Custo> custosIndicados = new ArrayList<>();

    @Relationship(type = "VINCULA", direction = Direction.OUTGOING)
    private ArrayList<ExecucaoOrcamentaria> execucoesOrcamentariaVinculadas = new ArrayList<>();

    public FonteOrcamentaria(String nome) {
        this.nome = nome;
    }

    public FonteOrcamentaria(Long codigo, String nome, List<Custo> custos, List<ExecucaoOrcamentaria> execucoes) {
        this.codigo = codigo;
        this.nome = nome;
        custos.forEach(this.custosIndicados::add);
        execucoes.forEach(this.execucoesOrcamentariaVinculadas::add);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FonteOrcamentaria other = (FonteOrcamentaria) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    

}
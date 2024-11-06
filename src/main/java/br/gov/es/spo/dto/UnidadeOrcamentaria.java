package br.gov.es.spo.dto;

import java.io.Serializable;
import java.util.ArrayList;
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
public class UnidadeOrcamentaria extends Entidade implements Serializable {
    
    private Long codigo;
    private String sigla;
    private String nome;

    @Relationship(type = "CONTROLA", direction = Direction.OUTGOING)
    private ArrayList<PlanoOrcamentario> planosOrcamentariosControlados = new ArrayList<>();

    @Relationship(type = "IMPLEMENTA", direction = Direction.OUTGOING)
    private ArrayList<ExecucaoOrcamentaria> execucaoOrcamentariasImplementadas = new ArrayList<>();

    @Relationship(type = "INFORMA", direction = Direction.OUTGOING)
    private ArrayList<Custo> custosInformados = new ArrayList<>();

    public UnidadeOrcamentaria(Long codigo, String sigla, List<PlanoOrcamentario> planoOrcamentarios, List<ExecucaoOrcamentaria> execucoes) {
        this.codigo = codigo;
        this.sigla = sigla;
        planoOrcamentarios.forEach(this.planosOrcamentariosControlados::add);
        execucoes.forEach(this.execucaoOrcamentariasImplementadas::add);
    }

    public static UnidadeOrcamentaria criar(Long codigo, String sigla) {
        UnidadeOrcamentaria novo = new UnidadeOrcamentaria();
        novo.codigo = codigo;
        novo.sigla = sigla;
        DataMock.noUnidadeOrcamentarias.add(novo);
        return novo;
    }

}

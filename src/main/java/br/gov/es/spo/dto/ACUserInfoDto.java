package br.gov.es.spo.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import br.gov.es.spo.dto.desserializer.ACUserInfoDtoDeserializer;

@JsonDeserialize(using = ACUserInfoDtoDeserializer.class)
public record ACUserInfoDto(
        String apelido,
        Boolean cpfValidado,
        Boolean verificada,
        String verificacaoTipo,
        String subNovo,
        Boolean agentepublico,
        String email,
        String emailCorporativo,
        String sub,
        Set<String> role) {

    public ACUserInfoDto(ACUserInfoDtoStringRole userInfo) {
        this(userInfo.apelido(), userInfo.cpfValidado(), userInfo.verificada(), userInfo.verificacaoTipo(), userInfo.subNovo(),
                userInfo.agentepublico(), userInfo.email(), userInfo.emailCorporativo(), userInfo.sub(),
                new HashSet<>(List.of(userInfo.role())));
    }
}

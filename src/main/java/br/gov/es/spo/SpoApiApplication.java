package br.gov.es.spo;

import org.neo4j.cypherdsl.core.renderer.Configuration;
import org.neo4j.cypherdsl.core.renderer.Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SpoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpoApiApplication.class, args);
    }

    @Bean
    Configuration cypherDslConfiguration() {
        return Configuration.newConfig().withDialect(Dialect.NEO4J_5).build();
    }

}

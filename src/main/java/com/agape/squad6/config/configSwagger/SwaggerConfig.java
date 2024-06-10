package com.agape.squad6.config.configSwagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
@SecurityScheme(
    name = "bearerAuth",
    type = SecuritySchemeType.HTTP,
    bearerFormat = "JWT",
    scheme = "bearer"
)       
public class SwaggerConfig {
    @Bean
    public OpenAPI customAPI(){
        return new OpenAPI().info(new Info().title("Swagger Agape").version("1.0.0")
                .license(new License().name("Licença do Sistema").url("www.documentacionagape.com")));
    }

}

package com.dsa.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	@Value("${bnxt.swagger.base-url}")
	private  String swaggerUiBaseUrl;
	
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Data Structure and Algorithm")
                .version("v1")
                .description("Swagger documentation for the Data Structure and Algorithm"))
            .addServersItem(new Server().url(swaggerUiBaseUrl));
    }
}


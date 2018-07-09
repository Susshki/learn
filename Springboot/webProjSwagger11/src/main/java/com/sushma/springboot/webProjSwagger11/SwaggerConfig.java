package com.sushma.springboot.webProjSwagger11;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	
	private static final ApiInfo API_INFO = new ApiInfo("Sushma API", "SUSHMA API DESC", "0.0.1", "","Sushma", "", "");

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(API_INFO)
				.produces(new HashSet<>(Arrays.asList("application/xml", "application/json")))
				.consumes(new HashSet<>(Arrays.asList("application/xml", "application/json")));
	}
}

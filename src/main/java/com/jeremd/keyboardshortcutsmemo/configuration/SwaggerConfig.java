package com.jeremd.keyboardshortcutsmemo.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
    
    /**
     * 
     * ApiInfo
     * 
	 * String title
	 * String description
	 * String version
	 * String termsOfServiceUrl
	 * new Contact(contactName, "", "")
	 * String license
	 * String licenseUrl
     * 
     * @return
     */
    @Bean
    public ApiInfo apiInfo() {
    	
        return new ApiInfo(
            "Memo raccourcis clavier",
            "This is a sample Spring Boot RESTful service using SpringFox + Swagger 2",
            "V1",
            "",
            new Contact("JeremD", "https://github.com/JeremD/", ""), 
            "CC BY-SA 3.0",
            "https://creativecommons.org/licenses/by-sa/3.0/",
            Collections.emptyList()
        );
    }
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .apiInfo(apiInfo())
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}

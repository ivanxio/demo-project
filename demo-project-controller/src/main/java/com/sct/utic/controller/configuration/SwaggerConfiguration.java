/*
 *      File: SwaggerConfiguration.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 11, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.controller.configuration;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This class is used to setup swagger.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    /** The enviroment properties. */
    @Autowired
    private Environment enviroment;

    /**
     * Method used to setup swagger.
     *
     * @return The Docket object.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(enviroment.getProperty("application.package.controller")))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    /**
     * Method used to define API.
     *
     * @return The APiInfo object.
     */
    private ApiInfo apiInfo() {
        return new ApiInfo(enviroment.getProperty("application.name"), enviroment.getProperty("application.description"),
                enviroment.getProperty("application.version"), enviroment.getProperty("application.termsOfServiceUrl"),
                new Contact(enviroment.getProperty("application.contact.name"),
                        enviroment.getProperty("application.contact.url"), enviroment.getProperty("application.contact.email")),
                enviroment.getProperty("application.license"), enviroment.getProperty("application.licenseUrl"),
                Collections.emptyList());
    }
}

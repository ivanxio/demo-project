/*
 *      File: DemoProjectApplication.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Feb 28, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2017
 */
package com.sct.utic.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Start the demo project application.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@SpringBootApplication
public class DemoProjectApplication {

    /**
     * Starts the application.
     *
     * @param args
     *            The command line arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoProjectApplication.class, args);
    }
}
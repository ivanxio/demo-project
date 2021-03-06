/*
 *      File: PersonController.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Feb 28, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sct.utic.repository.entity.Person;
import com.sct.utic.service.PersonService;

/**
 * RESTful used to person API.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    /**
     * Class Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    /**
     * The person service.
     */
    @Autowired
    private PersonService personService;

    /**
     * Create a new instance of {@link PersonController}.
     */
    public PersonController() {
    }

    /**
     * Method used to retrieves person by identifier.
     *
     * @param id The person identifier.
     * @return The persons found.
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Person> findById(@PathVariable(name = "id", required = true) final Long id) {
        LOGGER.debug("Retrieves persons list.");
        ResponseEntity<Person> response;
        try {
            final Optional<Person> person = personService.findById(id);
            if (person.isPresent()) {
                response = ResponseEntity.status(HttpStatus.OK).body(person.get());
            } else {
                response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (final Exception e) {
            LOGGER.error("Error: ", e);
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return response;
    }
}
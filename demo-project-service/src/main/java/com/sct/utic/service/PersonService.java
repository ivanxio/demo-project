/*
 *      File: PersonService.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 01, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sct.utic.repository.PersonRepository;
import com.sct.utic.repository.entity.Person;

/**
 * Service layer of person.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class PersonService {

    /**
     * Class logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonService.class);
    /**
     * The person repository.
     */
    @Autowired
    private PersonRepository personRepository;

    /**
     * Method used to retrieves a person by identifier.
     *
     * @param id The person identifier.
     * @return The person object.
     */
    public Optional<Person> findById(final Long id) {
        LOGGER.debug("Retrieves person by identifier.");
        return personRepository.findById(id);
    }
}

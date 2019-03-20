/*
 *      File: PersonApi.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 11, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sct.utic.repository.entity.Person;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Person API.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Api(value = "person", description = "The person API")
@RequestMapping("/person")
public interface PersonApi {
    /**
     * Method used to retrieves person by identifier.
     *
     * @param id The person identifier.
     * @return The persons found.
     */
    @ApiOperation(value = "Find person by identifier.", nickname = "findById", notes = "Return a single person.", response = Person.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation.", response = Person.class),
            @ApiResponse(code = 400, message = "Invalid identifier supplied."),
            @ApiResponse(code = 404, message = "Person not found."), @ApiResponse(code = 500, message = "Internal error server.") })
    @RequestMapping(value = "/{id}", produces = { "application/xml", "application/json" }, method = RequestMethod.GET)
    ResponseEntity<Person> findById(
            @ApiParam(value = "Id of person to return", required = true) @PathVariable(name = "id", required = true) final Long id);

}
/*
 *      File: PersonControllerTest.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Feb 28, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.controller;


import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sct.utic.repository.entity.Person;
import com.sct.utic.service.PersonService;

/**
 * Class to test PersonController.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = PersonController.class, secure = false)
public class PersonControllerTest {
    /**
     * Path person controller.
     */
    private static final String PATH = "/person";
    /**
     * The mock.
     */
    @Autowired
    private MockMvc mvc;
    /**
     * The person service.
     */
    @MockBean
    private PersonService personService;

    @Before
    public void init(){
        mvc  = MockMvcBuilders.standaloneSetup(new PersonController()).build();
        personService = Mockito.mock(PersonService.class);
    }

    @Test
    public final void findByIdSuccess() throws Exception {
        final Person personEntity = new Person();
        final Optional<Person> personOptional = Optional.of(personEntity);
        Mockito.when(personService.findById(1L)).thenReturn(personOptional);
        final MvcResult response = mvc.perform(MockMvcRequestBuilders.get(PATH.concat("/1"))).andReturn();
        final int status = response.getResponse().getStatus();
        Assert.assertEquals(200, status);
    }
}
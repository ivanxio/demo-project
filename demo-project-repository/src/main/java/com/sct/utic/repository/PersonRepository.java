/*
 *      File: PersonRepository.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 01, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sct.utic.repository.entity.Person;

/**
 * The person repository.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}

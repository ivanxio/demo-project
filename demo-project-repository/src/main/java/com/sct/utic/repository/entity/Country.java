/*
 *      File: Country.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 06, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.repository.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The country entity.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "country", catalog = "")
public class Country implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = 1L;
    /** The country identifier. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    /** The country name. */
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    /** The country abbreviation name. */
    @Column(name = "abbreviation", length = 50, nullable = false)
    private String abbreviation;
    /** The federal entities objects. */
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<FederalEntity> federalEntities;


    /**
     * Create a new instance of {@link Country}.
     */
    public Country() {
    }

    /**
     * Create a new instance of {@link Country}.
     *
     * @param name The country name.
     * @param abbreviation The abbreviation name.
     */
    public Country(final String name, final String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    /**
     * Getter id.
     *
     * @return the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter id.
     *
     * @param id the id to set.
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * Getter name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter name.
     *
     * @param name the name to set.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter abbreviation.
     *
     * @return the abbreviation.
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Setter abbreviation.
     *
     * @param abbreviation the abbreviation to set.
     */
    public void setAbbreviation(final String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * Getter federalEntities.
     *
     * @return the federalEntities.
     */
    public List<FederalEntity> getFederalEntities() {
        return federalEntities;
    }

    /**
     * Setter federalEntities.
     *
     * @param federalEntities the federalEntities to set.
     */
    public void setFederalEntities(final List<FederalEntity> federalEntities) {
        this.federalEntities = federalEntities;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Country [id=%s, name=%s, abbreviation=%s, federalEntities=%s]", id, name, abbreviation, federalEntities);
    }
}

/*
 *      File: FederalEntity.java
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The federal entity.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "federal_entity")
public class FederalEntity implements Serializable {
    /** The serial version UID. */
    private static final long serialVersionUID = 1L;
    /** The federal entity identifier. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    /** The federal entity name. */
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    /** The federal entity abbreviation name. */
    @Column(name = "abbreviation", length = 50, nullable = false)
    private String abbreviation;
    /** The country object. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
    /** The township objects. */
    @OneToMany(mappedBy = "federalEntity", fetch = FetchType.LAZY)
    private List<Township> townships;

    /**
     * Create a new instance of {@link FederalEntity}.
     */
    public FederalEntity() {
    }

    /**
     * Create a new instance of {@link FederalEntity}.
     *
     * @param name The federal entity name.
     * @param abbreviation The federal entity abbreviation name.
     * @param country The country object.
     * @param townships The township objects.
     */
    public FederalEntity(final String name, final String abbreviation, final Country country, final List<Township> townships) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.country = country;
        this.townships = townships;
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
     * Getter country.
     *
     * @return the country.
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter country.
     *
     * @param country the country to set.
     */
    public void setCountry(final Country country) {
        this.country = country;
    }

    /**
     * Getter townships.
     *
     * @return the townships.
     */
    public List<Township> getTownships() {
        return townships;
    }

    /**
     * Setter townships.
     *
     * @param townships the townships to set.
     */
    public void setTownships(final List<Township> townships) {
        this.townships = townships;
    }

    /* (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("FederalEntity [id=%s, name=%s, abbreviation=%s, country=%s, townships=%s]", id, name, abbreviation, country, townships);
    }
}
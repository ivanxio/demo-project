/*
 *      File: OrganizationType.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 08, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The organization type entity.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "organization_type")
public class OrganizationType implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = 1L;
    /** The organization type identifier. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    /** The organization type name. */
    @Column(name = "name")
    private String name;
    /** The abbreviation. */
    @Column(name = "abbreviation")
    private String abbreviation;
    /** Its indicate whether the row is active. */
    @Column(name = "active")
    private Boolean active;

    /**
     * Create a new instance of {@link OrganizationType}.
     */
    public OrganizationType() {
    }

    /**
     * Create a new instance of {@link OrganizationType}.
     *
     * @param name The organization type name.
     * @param abbreviation The abbreviation.
     * @param active Its indicate whether the row is active.
     */
    public OrganizationType(final String name, final String abbreviation, final Boolean active) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.active = active;
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
     * Getter active.
     *
     * @return the active.
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Setter active.
     *
     * @param active the active to set.
     */
    public void setActive(final Boolean active) {
        this.active = active;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("OrganizationType [id=%s, name=%s, abbreviation=%s, active=%s]", id, name, abbreviation, active);
    }
}
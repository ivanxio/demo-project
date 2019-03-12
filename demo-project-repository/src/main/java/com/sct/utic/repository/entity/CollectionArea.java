/*
 *      File: CollectionArea.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 08, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The collection area entity.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "collection_area")
public class CollectionArea implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = 1L;
    /** The collection area identifier. **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    /** The name direction general. */
    @Column(name = "name")
    private String name;
    /** The description of direction general. */
    @Column(name = "description")
    private String description;
    /** Its indicate whether the row is active. */
    @Column(name = "active")
    private Boolean active;
    /** The organization type object. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_type_id", nullable = false)
    private OrganizationType organizationType;

    /**
     * Create a new instance of {@link CollectionArea}.
     */
    public CollectionArea() {
    }

    /**
     * Create a new instance of {@link CollectionArea}.
     *
     * @param name The name direction general.
     * @param description The description of direction general.
     * @param active Its indicate whether the row is active.
     * @param organizationType The organization type object.
     */
    public CollectionArea(final String name, final String description, final Boolean active, final OrganizationType organizationType) {
        this.name = name;
        this.description = description;
        this.active = active;
        this.organizationType = organizationType;
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
     * Getter description.
     *
     * @return the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter description.
     *
     * @param description the description to set.
     */
    public void setDescription(final String description) {
        this.description = description;
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

    /**
     * Getter organizationType.
     *
     * @return the organizationType.
     */
    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    /**
     * Setter organizationType.
     *
     * @param organizationType the organizationType to set.
     */
    public void setOrganizationType(final OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("CollectionArea [id=%s, name=%s, description=%s, active=%s, organizationType=%s]", id, name, description, active,
                organizationType);
    }
}
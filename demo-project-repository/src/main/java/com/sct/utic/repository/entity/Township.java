/*
 *      File: Township.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Mar 06, 2019
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
 * The township entity.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "township")
public class Township implements Serializable {
    /** The serial version UID. */
    private static final long serialVersionUID = 1L;
    /** The township identifier. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    /** The township name. */
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    /** The township abbreviation name. */
    @Column(name = "abbreviation", length = 50, nullable = false)
    private String abbreviation;
    /** The entity federal object. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "federal_entity_id", nullable = false)
    private FederalEntity federalEntity;

    /**
     * Create a new instance of {@link Township}.
     */
    public Township() {
    }

    /**
     * Create a new instance of {@link Township}.
     *
     * @param name The township name.
     * @param abbreviation The township abbreviation.
     * @param federalEntity The federal entity object.
     */
    public Township(final String name, final String abbreviation, final FederalEntity federalEntity) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.federalEntity = federalEntity;
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
     * Getter federalEntity.
     *
     * @return the federalEntity.
     */
    public FederalEntity getFederalEntity() {
        return federalEntity;
    }

    /**
     * Setter federalEntity.
     *
     * @param federalEntity the federalEntity to set.
     */
    public void setFederalEntity(final FederalEntity federalEntity) {
        this.federalEntity = federalEntity;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Township [id=%s, name=%s, abbreviation=%s, federalEntity=%s]", id, name, abbreviation, federalEntity);
    }
}
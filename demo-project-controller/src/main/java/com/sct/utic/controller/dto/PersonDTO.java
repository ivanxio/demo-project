/*
 *      File: PersonDTO.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Feb 28, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.controller.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Data transfer object person.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public class PersonDTO implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = 5550982393985283154L;
    /**
     * The person identifier.
     */
    private Long id;
    /**
     * The person name.
     */
    private String name;
    /**
     * The person last name.
     */
    private String lastName;
    /**
     * The person birthday.
     */
    private Date birthday;
    /**
     * It indicate whether the person is active.
     */
    private Boolean active;

    /**
     * Create a new instance of {@link PersonDTO}.
     */
    public PersonDTO() {

    }

    /**
     * Create a new instance of {@link PersonDTO}.
     *
     * @param id The person identifier.
     * @param name The person name.
     * @param lastName The person last name.
     * @param birthday The person birthday.
     * @param active It indicate whether the person is active.
     */
    public PersonDTO(final Long id, final String name, final String lastName, final Date birthday, final Boolean active) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthday = (Date) birthday.clone();
        this.active = active;
    }

    /**
     * Getter id.
     *
     * @return the id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter id.
     *
     * @param id the id to set.
     */
    public void setId(final Long id) {
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
     * Getter lastName.
     *
     * @return the lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter lastName.
     *
     * @param lastName the lastName to set.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter birthday.
     *
     * @return the birthday.
     */
    public Date getBirthday() {
        return (Date) birthday.clone();
    }

    /**
     * Setter birthday.
     *
     * @param birthday the birthday to set.
     */
    public void setBirthday(final Date birthday) {
        this.birthday = (Date) birthday.clone();
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
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((active == null) ? 0 : active.hashCode());
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonDTO other = (PersonDTO) obj;
        if (active == null) {
            if (other.active != null) {
                return false;
            }
        } else if (!active.equals(other.active)) {
            return false;
        }
        if (birthday == null) {
            if (other.birthday != null) {
                return false;
            }
        } else if (!birthday.equals(other.birthday)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("PersonDTO [id=%s, name=%s, lastName=%s, birthday=%s, active=%s]", id, name, lastName, birthday, active);
    }
}

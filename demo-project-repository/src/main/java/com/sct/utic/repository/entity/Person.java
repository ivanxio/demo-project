/*
 *      File: Person.java
 *    Author: Ivan Garcia <ivan.garcia@neixar.com.mx>
 *      Date: Feb 25, 2019
 * Copyright: Secretaria de Comunicaciones y Transporte. 2019
 */
package com.sct.utic.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The person entity.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "person")
public class Person {
    /** The customer identifier. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /** The customer name. */
    @Column(name = "name", nullable = false)
    private String name;
    /** The customer lastName. */
    @Column(name = "last_name", nullable = false)
    private String lastName;
    /** The customer years old. */
    @Column(name = "birthday",  nullable = false)
    private Date birthday;
    /** It indicates whether the customer is active. **/
    @Column(name = "active", nullable = false)
    private Boolean active;

    /**
     * Create a new Customer object.
     */
    public Person() {
    }

    /**
     * Create a new instance of {@link Person}.
     *
     * @param name The person name.
     * @param lastName The person last name.
     * @param birthday The person birthday.
     * @param active It indicate whether the person is active.
     */
    public Person(final String name, final String lastName, final Date birthday, final Boolean active) {
        super();
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
        final Person other = (Person) obj;
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
        return String.format("Person [id=%s, name=%s, lastName=%s, birthday=%s, active=%s]", id, name, lastName, birthday, active);
    }
}
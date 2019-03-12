/*
 *      File: Bank.java
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
 * The bank entity.
 *
 * @author Ivan Garcia &lt;ivan.garcia@neixar.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "bank")
public class Bank implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = 1L;
    /** The bank identifier. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    /** The bank name. */
    @Column(name = "name", length = 30, nullable = false)
    private String name;
    /** The business name. */
    @Column(name = "business_name", length = 100, nullable = false)
    private String businessName;
    /** The branch bank number. */
    @Column(name = "branch_number", nullable = false)
    private Integer branchNumber;
    /** The bank account number. */
    @Column(name = "bank_account_number", nullable = false)
    private Long accountNumber;
    /** The description of format tab. */
    @Column(name = "description_format_tab", length = 200, nullable = false)
    private String descriptionFormatTab;
    /** The description of loading process. */
    @Column(name = "description_loading_process", length = 200, nullable = false)
    private String descriptionLoadingProcess;
    /** The SAT code. */
    @Column(name = "sat_code", nullable = false)
    private Long satCode;
    /** The bank contact. */
    @Column(name = "contact", length = 50, nullable = false)
    private String contact;
    /** The phone number. */
    @Column(name = "phone", nullable = false)
    private Integer phone;
    /** The email. */
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    /** The address. */
    @Column(name = "address", length = 200, nullable = false)
    private String adrress;
    /** Its indicate whether the row is active. */
    @Column(name = "active", nullable = false)
    private Boolean active;
    /** The township object. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "township_id", nullable = false)
    private Township township;

    /**
     * Create a new instance of {@link Bank}.
     */
    public Bank() {
    }

    /**
     * Create a new instance of {@link Bank}.
     *
     * @param name The bank name.
     * @param businessName The business name.
     * @param branchNumber The branch bank number.
     * @param accountNumber The bank account number.
     * @param descriptionFormatTab The description of format tab.
     * @param descriptionLoadingProcess The description of loading process.
     * @param satCode The SAT code.
     * @param contact The bank contact.
     * @param phone The phone number.
     * @param email The email.
     * @param adrress The address.
     * @param active Its indicate whether the row is active.
     * @param township The township object.
     */
    public Bank(final String name, final String businessName, final Integer branchNumber, final Long accountNumber,
            final String descriptionFormatTab, final String descriptionLoadingProcess, final Long satCode, final String contact,
            final Integer phone, final String email, final String adrress, final Boolean active, final Township township) {
        this.name = name;
        this.businessName = businessName;
        this.branchNumber = branchNumber;
        this.accountNumber = accountNumber;
        this.descriptionFormatTab = descriptionFormatTab;
        this.descriptionLoadingProcess = descriptionLoadingProcess;
        this.satCode = satCode;
        this.contact = contact;
        this.phone = phone;
        this.email = email;
        this.adrress = adrress;
        this.active = active;
        this.township = township;
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
     * Getter businessName.
     *
     * @return the businessName.
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Setter businessName.
     *
     * @param businessName the businessName to set.
     */
    public void setBusinessName(final String businessName) {
        this.businessName = businessName;
    }

    /**
     * Getter branchNumber.
     *
     * @return the branchNumber.
     */
    public Integer getBranchNumber() {
        return branchNumber;
    }

    /**
     * Setter branchNumber.
     *
     * @param branchNumber the branchNumber to set.
     */
    public void setBranchNumber(final Integer branchNumber) {
        this.branchNumber = branchNumber;
    }

    /**
     * Getter accountNumber.
     *
     * @return the accountNumber.
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter accountNumber.
     *
     * @param accountNumber the accountNumber to set.
     */
    public void setAccountNumber(final Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter descriptionFormatTab.
     *
     * @return the descriptionFormatTab.
     */
    public String getDescriptionFormatTab() {
        return descriptionFormatTab;
    }

    /**
     * Setter descriptionFormatTab.
     *
     * @param descriptionFormatTab the descriptionFormatTab to set.
     */
    public void setDescriptionFormatTab(final String descriptionFormatTab) {
        this.descriptionFormatTab = descriptionFormatTab;
    }

    /**
     * Getter descriptionLoadingProcess.
     *
     * @return the descriptionLoadingProcess.
     */
    public String getDescriptionLoadingProcess() {
        return descriptionLoadingProcess;
    }

    /**
     * Setter descriptionLoadingProcess.
     *
     * @param descriptionLoadingProcess the descriptionLoadingProcess to set.
     */
    public void setDescriptionLoadingProcess(final String descriptionLoadingProcess) {
        this.descriptionLoadingProcess = descriptionLoadingProcess;
    }

    /**
     * Getter satCode.
     *
     * @return the satCode.
     */
    public Long getSatCode() {
        return satCode;
    }

    /**
     * Setter satCode.
     *
     * @param satCode the satCode to set.
     */
    public void setSatCode(final Long satCode) {
        this.satCode = satCode;
    }

    /**
     * Getter contact.
     *
     * @return the contact.
     */
    public String getContact() {
        return contact;
    }

    /**
     * Setter contact.
     *
     * @param contact the contact to set.
     */
    public void setContact(final String contact) {
        this.contact = contact;
    }

    /**
     * Getter phone.
     *
     * @return the phone.
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * Setter phone.
     *
     * @param phone the phone to set.
     */
    public void setPhone(final Integer phone) {
        this.phone = phone;
    }

    /**
     * Getter email.
     *
     * @return the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter email.
     *
     * @param email the email to set.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Getter adrress.
     *
     * @return the adrress.
     */
    public String getAdrress() {
        return adrress;
    }

    /**
     * Setter adrress.
     *
     * @param adrress the adrress to set.
     */
    public void setAdrress(final String adrress) {
        this.adrress = adrress;
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
     * Getter township.
     *
     * @return the township.
     */
    public Township getTownship() {
        return township;
    }

    /**
     * Setter township.
     *
     * @param township the township to set.
     */
    public void setTownship(final Township township) {
        this.township = township;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
                .format("Bank [id=%s, name=%s, businessName=%s, branchNumber=%s, accountNumber=%s, descriptionFormatTab=%s, "
                        + "descriptionLoadingProcess=%s, satCode=%s, contact=%s, phone=%s, email=%s, adrress=%s, active=%s, township=%s]",
                        id, name, businessName, branchNumber, accountNumber, descriptionFormatTab, descriptionLoadingProcess,
                        satCode, contact, phone, email, adrress, active, township);
    }
}

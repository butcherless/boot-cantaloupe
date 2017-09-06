package com.taxy4fun.repository.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by cmartin on 23/06/2017.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate birthdate;
    /**
     * National Identity Card
     */
    private Long ic;
    private Boolean active;
    private String address;
    private String city;
    private String firstname;
    private String lastname;
    private Integer phone;
    private Integer postalcode;

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Long getIc() {
        return ic;
    }

    public void setIc(Long ic) {
        this.ic = ic;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", id)
                .append("birthdate", birthdate)
                .append("ic", ic)
                .append("active", active)
                .append("address", address)
                .append("city", city)
                .append("firstname", firstname)
                .append("lastname", lastname)
                .append("phone", phone)
                .append("postalcode", postalcode)
                .toString();
    }
}

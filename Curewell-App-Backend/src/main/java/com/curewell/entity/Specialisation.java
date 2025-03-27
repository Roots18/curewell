package com.curewell.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Specialisation")
public class Specialisation {

    @Id
    @Column(length = 3)
    private String specCode;

    @Column(nullable = false)
    private String specName;

    public Specialisation() {}

    public Specialisation(String specCode, String specName) {
        this.specCode = specCode;
        this.specName = specName;
    }

    public String getSpecCode() {
        return specCode;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }
}
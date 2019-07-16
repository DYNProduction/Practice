package com.company.programm.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String fullName;

    @Column
    private String address;

    @Column
    private String number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agent")
    private Set<Contract> contracts;

    public Agent() {
    }

    public Agent(Integer id, String fullName, String address, String number) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.number = number;
    }

    public Agent(Integer id, String fullName, String address, String number, Contract contract) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @JsonIgnore
    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}

package com.company.programm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private Integer codeBranch;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "branch")
    private Set<Contract> contracts;

    public Branch() {
    }

    public Branch(Integer id, String name, String address, String number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Branch(Integer id, Integer codeBranch, String name, String address, String number, Contract contract) {
        this.id = id;
        this.codeBranch = codeBranch;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Integer getCodeBranch() {
        return codeBranch;
    }

    public void setCodeBranch(Integer codeBranch) {
        this.codeBranch = codeBranch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

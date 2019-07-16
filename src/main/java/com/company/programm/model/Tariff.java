package com.company.programm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Integer tariffRate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tariff")
    private Set<Contract> contracts;

    public Tariff() {
    }

    public Tariff(Integer tariffRate) {
        this.tariffRate = tariffRate;
    }

    public Tariff(Integer id, Integer tariffRate) {
        this.id = id;
        this.tariffRate = tariffRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTariffRate() {
        return tariffRate;
    }

    public void setTariffRate(Integer tariffRate) {
        this.tariffRate = tariffRate;
    }

    @JsonIgnore
    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}



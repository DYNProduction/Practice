package DataBase.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String fullName;

    @Column
    private String adress;

    @Column
    private String number;

    public Integer getId() {
        return id;
    }

    public Agent(Integer id, String fullName, String adress, String number, Contract contract) {
        this.id = id;
        this.fullName = fullName;
        this.adress = adress;
        this.number = number;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Agent() {
    }

    public Agent(Integer id, String fullName, String adress, String number) {
        this.id = id;
        this.fullName = fullName;
        this.adress = adress;
        this.number = number;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agent")
    private Set<Contract> contracts;

    @JsonIgnore
    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}

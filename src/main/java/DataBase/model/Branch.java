package DataBase.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true,nullable = false)
    private Integer codeBranch;

    @Column
    private String name;

    @Column
    private String adress;

    @Column
    private String number;

    public Branch(Integer id, Integer codeBranch, String name, String adress, String number, Contract contract) {
        this.id = id;
        this.codeBranch = codeBranch;
        this.name = name;
        this.adress = adress;
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

    public Branch() {
    }

    public Branch(Integer id, String name, String adress, String number) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "branch")
    private Set<Contract> contracts;

    @JsonIgnore
    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}

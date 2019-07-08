package DataBase.model;

import javax.persistence.*;

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
        this.contract = contract;
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

    @OneToOne(optional = false, mappedBy = "branch")
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}

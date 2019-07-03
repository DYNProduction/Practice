package DataBase.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Branch {
    @Id
    private Integer codeBranch;

    @Column
    private String name;

    @Column
    private String adress;

    @Column
    private String number;

    public Integer getCodeBranch() {
        return codeBranch;
    }

    public void setCodeBranch(Integer codeBranch) {
        this.codeBranch = codeBranch;
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

    public Branch(Integer codeBranch, String name, String adress, String number) {
        this.codeBranch = codeBranch;
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    @OneToOne(optional = false, mappedBy = "bracnh")
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}

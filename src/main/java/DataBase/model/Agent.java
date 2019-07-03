package DataBase.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agent {

    @Id
    private Integer id;

    @Column
    private String fullName;

    @Column
    private String adress;

    @Column
    private String number;

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

    @OneToOne(optional = false, mappedBy = "agent")
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}

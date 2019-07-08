package DataBase.model;


import javax.persistence.*;

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
        this.contract = contract;
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

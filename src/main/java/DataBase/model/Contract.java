package DataBase.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true, nullable = false)
    private Integer codeContract;

    @Column
    private String incuranceType;

    @Column
    private Double insuranceAmount;

    @Column
    private Date insuranceDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(Integer codeContract) {
        this.codeContract = codeContract;
    }

    public String getIncuranceType() {
        return incuranceType;
    }

    public void setIncuranceType(String incuranceType) {
        this.incuranceType = incuranceType;
    }

    public Double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Date getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public Contract() {
    }

    public Contract(Integer id, Integer codeContract, String incuranceType, Double insuranceAmount, Date insuranceDate, Tariff tariff, Agent agent, Branch branch) {
        this.id = id;
        this.codeContract = codeContract;
        this.incuranceType = incuranceType;
        this.insuranceAmount = insuranceAmount;
        this.insuranceDate = insuranceDate;
        this.tariff = tariff;
        this.agent = agent;
        this.branch = branch;
    }

    @OneToOne(optional = false)
    @JoinColumn(name="codeTariff_id", unique = true, nullable = false, updatable = false)
    private Tariff tariff;

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    @OneToOne(optional = false)
    @JoinColumn(name="codeAgent_id", unique = true, nullable = false, updatable = false)
    private Agent agent;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }


    @OneToOne(optional = false)
    @JoinColumn(name="codeBranch_id", unique = true, nullable=false, updatable = false)
    private Branch branch;

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}

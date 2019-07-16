package com.company.programm.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private Integer codeContract;

    @Column
    private String insuranceType;

    @Column
    private Double insuranceAmount;

    @Column
    private Date insuranceDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codeTariff_id", nullable = false)
    private Tariff tariff;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codeAgent_id", nullable = false)
    private Agent agent;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codeBranch_id", nullable = false)
    private Branch branch;

    public Contract() {
    }

    public Contract(Integer id, Integer codeContract, String insuranceType, Double insuranceAmount, Date insuranceDate, Tariff tariff, Agent agent, Branch branch) {
        this.id = id;
        this.codeContract = codeContract;
        this.insuranceType = insuranceType;
        this.insuranceAmount = insuranceAmount;
        this.insuranceDate = insuranceDate;
        this.tariff = tariff;
        this.agent = agent;
        this.branch = branch;
    }

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

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
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

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}

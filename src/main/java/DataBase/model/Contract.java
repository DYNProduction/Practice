package DataBase.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    private Integer codeContract;

    @Column
    private String incuranceType;

    @Column
    private Double insuranceAmount;

    @Column
    private Date insuranceDate;

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

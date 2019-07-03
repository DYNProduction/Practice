package DataBase.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Tariff {

    @Id
    private Integer id;

    @Column
    private Integer tariffRate;

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

    public Tariff() {
    }

    public Tariff(Integer id, Integer tariffRate) {
        this.id = id;
        this.tariffRate = tariffRate;
    }

    @OneToOne(optional = false, mappedBy = "tariff")
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}



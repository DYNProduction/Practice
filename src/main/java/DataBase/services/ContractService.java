package DataBase.services;

import DataBase.model.Contract;
import DataBase.repository.ContractRepository;
import org.springframework.stereotype.Service;


@Service
public class ContractService extends EntityCrud<Contract, ContractRepository> {
    ContractService(ContractRepository repository) {
        super(repository);
    }

}

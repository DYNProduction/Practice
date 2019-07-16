package com.company.programm.services;

import com.company.programm.model.Contract;
import com.company.programm.repository.ContractRepository;
import org.springframework.stereotype.Service;


@Service
public class ContractService extends EntityCrud<Contract, ContractRepository> {
    ContractService(ContractRepository repository) {
        super (repository);
    }

}

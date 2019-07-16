package com.company.programm.resource;

import com.company.programm.model.Contract;
import com.company.programm.services.ContractService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contracts")
public class ContractResource extends CrudResource<Contract, ContractService> {

    public ContractResource(ContractService service) {
        super (service);
    }
}

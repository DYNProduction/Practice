package DataBase.UserResource;

import DataBase.model.Contract;
import DataBase.services.ContractService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contracts")
public class ContractResource extends CrudResource<Contract, ContractService> {


    public ContractResource(ContractService service) {
        super(service);
    }
}

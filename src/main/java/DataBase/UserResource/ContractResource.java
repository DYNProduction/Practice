package DataBase.UserResource;

import DataBase.model.Contract;
import DataBase.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/contracts")
public class ContractResource {

    @Autowired
    private ContractService contractService;

    @GetMapping
    public List<Contract> getAll() {
        return contractService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Contract save (@RequestBody Contract contract){
        return contractService.save(contract);
    }

    @DeleteMapping(value="/{id}")
    public void deleteById(@PathVariable Optional<Integer> id){
        contractService.deleteById(id.get());
    }
}

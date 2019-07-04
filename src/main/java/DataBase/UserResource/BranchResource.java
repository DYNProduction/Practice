package DataBase.UserResource;

import DataBase.model.Branch;
import DataBase.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value ="/branchs")
public class BranchResource {

    @Autowired
    private BranchService branchService;

    @GetMapping
    public List<Branch> getAll(){
        return branchService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Branch save(@RequestBody Branch branch){
        return  branchService.save(branch);
    }

    @DeleteMapping(value="/{id}")
    public void deleteById(@PathVariable Optional<Integer> id){
        branchService.deleteById((id.get()));
    }
}

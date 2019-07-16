package com.company.programm.resource;

import com.company.programm.model.Branch;
import com.company.programm.services.BranchService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/branchs")
public class BranchResource extends CrudResource<Branch, BranchService> {
    public BranchResource(BranchService service) {
        super (service);
    }
}

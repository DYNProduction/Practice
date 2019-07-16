package com.company.programm.services;

import com.company.programm.model.Branch;
import com.company.programm.repository.BranchRepository;
import org.springframework.stereotype.Service;

@Service
public class BranchService extends EntityCrud<Branch, BranchRepository> {
    BranchService(BranchRepository repository) {
        super (repository);
    }
}

package DataBase.services;

import DataBase.model.Branch;
import DataBase.repository.BranchRepository;
import org.springframework.stereotype.Service;

@Service
public class BranchService extends EntityCrud<Branch, BranchRepository> {
    BranchService(BranchRepository repository) {
        super(repository);
    }
}

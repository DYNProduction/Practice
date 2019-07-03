package DataBase.repository;

import DataBase.model.Branch;
import org.springframework.data.repository.CrudRepository;

public interface BranchRepository extends CrudRepository<Branch, Integer> {
}

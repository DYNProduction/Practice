package DataBase.services;

import DataBase.model.Agent;
import DataBase.repository.AgentRepository;
import org.springframework.stereotype.Service;

@Service
public class AgentService extends EntityCrud<Agent, AgentRepository> {

    AgentService(AgentRepository repository) {
        super(repository);
    }
}

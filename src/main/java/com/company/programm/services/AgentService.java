package com.company.programm.services;

import com.company.programm.model.Agent;
import com.company.programm.repository.AgentRepository;
import org.springframework.stereotype.Service;

@Service
public class AgentService extends EntityCrud<Agent, AgentRepository> {

    AgentService(AgentRepository repository) {
        super (repository);
    }
}

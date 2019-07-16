package com.company.programm.resource;

import com.company.programm.model.Agent;
import com.company.programm.services.AgentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/agents")
public class AgentResource extends CrudResource<Agent, AgentService> {

    public AgentResource(AgentService service) {
        super (service);
    }
}

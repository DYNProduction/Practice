package DataBase.UserResource;

import DataBase.model.Agent;
import DataBase.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/agents")
public class AgentResource {

    @Autowired
    private AgentService agentService;

    @GetMapping
    public List<Agent> getAll(){
        return agentService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Agent save (@RequestBody Agent agent) {
        return agentService.save(agent);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Optional<Integer> id){
        agentService.deleteById(id.get());
    }
}

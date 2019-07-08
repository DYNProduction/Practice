package DataBase.UserResource;

import DataBase.services.EntityService;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public class CrudResource<T, E extends EntityService> {

    private E service;

    public CrudResource(E service) {
        this.service=service;
    }

    @GetMapping
    public List getAll(){
        return service.getAll();
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public T save (@RequestBody T user){
        return (T) service.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Optional<Integer> id){
        service.deleteById(id.get());
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public T update(@RequestBody T user){
        return (T) service.update(user);
    }
}

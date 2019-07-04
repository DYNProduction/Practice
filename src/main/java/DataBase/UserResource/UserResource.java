package DataBase.UserResource;

import DataBase.model.User;
import DataBase.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public User save (@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Optional<Integer> id){
        userService.deleteById(id.get());
    }

}

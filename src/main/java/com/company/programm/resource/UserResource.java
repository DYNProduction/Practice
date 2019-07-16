package com.company.programm.resource;

import com.company.programm.model.User;
import com.company.programm.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource extends CrudResource<User, UserService> {
    public UserResource(UserService userService) {
        super (userService);
    }

}

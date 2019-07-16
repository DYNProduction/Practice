package com.company.programm.services;

import com.company.programm.model.User;
import com.company.programm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends EntityCrud<User, UserRepository> {

    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository) {
        super (repository);
        userRepository = repository;
    }

    @Override
    public User save(User newElement) {
        newElement.setPassword (passwordEncoder.encode (newElement.getPassword ()));

        return userRepository.save (newElement);
    }

    @Override
    public User update(User newElement) {
        newElement.setPassword (passwordEncoder.encode (newElement.getPassword ()));

        return userRepository.save (newElement);
    }


}

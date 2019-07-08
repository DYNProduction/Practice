package DataBase.services;

import DataBase.model.User;
import DataBase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends EntityCrud<User, UserRepository> {

    private UserRepository userRepository;

    public UserService(UserRepository repository) {
        super(repository);
        userRepository = repository;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User newElement) {
        newElement.setPassword(passwordEncoder.encode(newElement.getPassword()));

        return userRepository.save(newElement);
    }

    @Override
    public User update (User newElement){
        newElement.setPassword(passwordEncoder.encode(newElement.getPassword()));

        return  userRepository.save(newElement);
    }


}

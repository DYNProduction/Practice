package DataBase.services;

import DataBase.model.User;
import DataBase.repository.UserRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService extends EntityCrud<User, UserRepository> {

    private UserRepository userRepository;

    public UserService(UserRepository repository) {
        super(repository);
        userRepository = repository;
    }

    @Override
    public User save(User newElement) {
        try {
            newElement.setPassword(DigestUtils.md2Hex(newElement.getPassword()));
        }
        catch (Exception ignored){
        }

        return userRepository.saveAndFlush(newElement);
    }

}

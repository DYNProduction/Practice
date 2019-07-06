package DataBase.services;

import DataBase.model.User;
import DataBase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login){
        User user = userRepository.findByLogin(login);
        if (user == null) {
            try {
                throw new LoginNotFoundException(login);
            } catch (LoginNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new MyUserPrincipal(user);
    }
}

package lt.auba.getadvice.service;

import lt.auba.getadvice.model.User;
import lt.auba.getadvice.repository.RoleRepository;
import lt.auba.getadvice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public void saveUserData(User user){
        userRepository.save(user);
    }
}

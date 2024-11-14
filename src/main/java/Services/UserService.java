package Services;

import Entity.UserLogins;
import Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Component
@Service
public class UserService {
    UserRepository userRepository;
    UserLogins users;

  @Autowired
  public UserService(UserRepository userRepository, UserLogins users) {
      this.userRepository=userRepository;
      this.users=users;
  }


    public List<UserLogins> getAllUsers() {
     return userRepository.findAll();
    }

    public Optional<UserLogins> getUserById(int id) {
      return userRepository.findById(id);
    }
    public UserLogins addUser(UserLogins user) {
      return userRepository.save(user);
    }

    public UserLogins updateUser(UserLogins user) {
      return userRepository.save(user);
    }
    public void deleteUser(int id) {
      userRepository.deleteById(id);
    }


}

package pl.wsb.student.TaskREST.User;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsb.student.TaskREST.Task.TaskEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

     public void addNewUser(UserEntity user) {
         Optional<UserEntity> userByLogin = userRepository.findUserByLogin(user.getLogin());
         if (userByLogin.isPresent()){
             throw new IllegalStateException("Login Taken");
         }
         userRepository.save(user);
         System.out.println(user);
     }

    public void deleteUser(int userId) {
        boolean exists = userRepository.existsById(userId);
        if (!exists){ throw new IllegalStateException("Task with id "+userId+" does not exists");}
        userRepository.deleteById(userId);
    }

//    public Collection<UserEntity> getAllUsers(){
//        return this.userDAO.getAllUsers();
//    }
}

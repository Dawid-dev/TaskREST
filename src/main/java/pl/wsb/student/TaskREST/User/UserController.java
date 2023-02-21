package pl.wsb.student.TaskREST.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path="users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(path="/all")
    public List<UserEntity> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @PostMapping(path="/new")
    public void addNewUser(@RequestBody UserEntity user) {
        userService.addNewUser(user);
    }

    @DeleteMapping(path="/del/{userId}")
    public void deleteUser(@PathVariable("userId") int userId){
        userService.deleteUser(userId);
    }
}

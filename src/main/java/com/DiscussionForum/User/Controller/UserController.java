package com.DiscussionForum.User.Controller;

import com.DiscussionForum.User.Service.UserService;
import com.DiscussionForum.User.ServiceImpl.UserServiceImpl;
import com.DiscussionForum.User.UserEntity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/v1/user")
public class UserController {

    UserService userService;

    public UserController(UserServiceImpl userService){
        this.userService=userService;
    }

    @PostMapping
    public void createUser(User user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{user_id}")
    public User getUser(@PathVariable("user_id") int id){
        return userService.getUser(id);
    }

    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable("user_id") int id){
        userService.removeUser(id);
    }

}

package com.DiscussionForum.User.ServiceImpl;

import com.DiscussionForum.User.Repository.UserRepository;
import com.DiscussionForum.User.Service.UserService;
import com.DiscussionForum.User.UserEntity.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
        return;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void removeUser(int id) {
        userRepository.deleteById(id);
    }
}

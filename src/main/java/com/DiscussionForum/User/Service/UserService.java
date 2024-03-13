package com.DiscussionForum.User.Service;

import com.DiscussionForum.User.UserEntity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public void addUser(User user);
    public List<User> getAllUsers();
    public User getUser(int id);
    public void removeUser(int id);

}

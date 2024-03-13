package com.DiscussionForum.User.Repository;

import com.DiscussionForum.User.UserEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
//    public User findUserByID(int id);
}

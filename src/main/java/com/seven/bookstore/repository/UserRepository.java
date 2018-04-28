package com.seven.bookstore.repository;

import com.seven.bookstore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select u from User u where u.user_name = ?1")
    public List findByUserName(String username);
}

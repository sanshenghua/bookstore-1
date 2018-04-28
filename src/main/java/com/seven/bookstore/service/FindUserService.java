package com.seven.bookstore.service;

import com.seven.bookstore.domain.StateCode;
import com.seven.bookstore.domain.User;
import com.seven.bookstore.exception.UserException;
import com.seven.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindUserService {

    @Autowired
    UserRepository userRepository;

    public User findOneUser(Integer id) throws Exception{
        try {
            return userRepository.findById(id).get();
        } catch(Exception e) {
            throw new UserException(StateCode.NoUserFindById);
        }
    }

    public List<User> findByUsername(String username) throws Exception{
        try {
            return userRepository.findByUserName(username);
        } catch(Exception e) {
            throw new UserException(StateCode.NoUserFindById);
        }
    }
}

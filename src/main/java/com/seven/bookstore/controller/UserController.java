package com.seven.bookstore.controller;

import com.seven.bookstore.domain.Response;
import com.seven.bookstore.domain.User;
import com.seven.bookstore.repository.UserRepository;
import com.seven.bookstore.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/user/{id}")
    public HashMap<String, Object> userFindById(@PathVariable("id") Integer id) {
        User user = userRepository.findById(id).get();

        return ResponseWrapper.success(user);
    }
}

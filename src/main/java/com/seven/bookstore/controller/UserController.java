package com.seven.bookstore.controller;

import com.seven.bookstore.domain.Response;
import com.seven.bookstore.domain.User;
import com.seven.bookstore.repository.UserRepository;
import com.seven.bookstore.service.FindUserService;
import com.seven.bookstore.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    FindUserService findUserService;

    @GetMapping(value = "/user/{id}")
    public HashMap<String, Object> userFindById(@PathVariable("id") Integer id) throws Exception{
        User user =   findUserService.findOneUser(id);
        return ResponseWrapper.success(user);
    }

    @GetMapping(value = "/user/username/{username}")
    public HashMap<String, Object> userFindById(@PathVariable("username") String username) throws Exception{
        List<User> userList =   findUserService.findByUsername(username);
        return ResponseWrapper.success(userList);
    }


}

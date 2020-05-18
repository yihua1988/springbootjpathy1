package com.offcn.springbootjpathy1.service.impl;


import com.offcn.springbootjpathy1.dao.UserRepository;
import com.offcn.springbootjpathy1.model.User;
import com.offcn.springbootjpathy1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public void updateUser(Long id, User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}

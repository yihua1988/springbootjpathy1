package com.offcn.springbootjpathy1.service;


import com.offcn.springbootjpathy1.model.User;

import java.util.List;

public interface UserService {
    /**
     *
     * @return
     */
     List<User> getUserList();

    /**
     *
     * @param user
     */
     void createUser(User user);

    /**
     *
     * @param id
     * @return
     */
     User getUser(Long id);

    /**
     *
     * @param id
     * @param user
     */
     void updateUser(Long id, User user);

    /**
     *
     * @param id
     */
     void deleteUser(Long id);
}

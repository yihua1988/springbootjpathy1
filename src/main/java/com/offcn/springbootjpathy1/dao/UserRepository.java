package com.offcn.springbootjpathy1.dao;


import com.offcn.springbootjpathy1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
    User findByNameAndAge(String name, Integer age);
}

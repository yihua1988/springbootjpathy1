package com.offcn.springbootjpathy1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="name",nullable = true,length = 200)
    private String name;
    @Column(name="age",nullable = true,length = 4)
    private Integer age;
}

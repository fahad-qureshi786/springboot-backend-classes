package com.sibau.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "users")
@Entity
@Getter
@Setter
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String firstName;
    private String lastName;
    @Column(name = "user_email", unique = true)
    private String email;
    @Column(name = "passsword")
    private String password;

    @Column(name = "contact", unique = true, length =11)
    private String phone;
}

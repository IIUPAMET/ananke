package com.feellemon.ananke.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Entity
@Setter
@Getter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name= "first_name")
    String firstName;

    @Column(name= "last_name")
    String lastName;

    @Column(name = "email", unique = true, nullable = false)
    String email;
}

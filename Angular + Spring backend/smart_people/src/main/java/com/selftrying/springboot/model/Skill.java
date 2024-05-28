package com.selftrying.springboot.model;

import com.selftrying.springboot.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="")
    private Long id;
    
    @Column(name="")
    private String Skill_name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(name="")
    private User user;

    // Constructors, getters and setters

    // Additional methods
}

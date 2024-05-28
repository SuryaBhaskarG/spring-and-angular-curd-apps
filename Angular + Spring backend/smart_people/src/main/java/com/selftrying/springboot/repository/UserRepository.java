package com.selftrying.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selftrying.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

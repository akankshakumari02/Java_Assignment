package com.springsecurity.demo.springsecurityoath2bootcamp;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    //finder method
    User findByUsername(String username);
}

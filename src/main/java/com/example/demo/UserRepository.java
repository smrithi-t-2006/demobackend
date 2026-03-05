package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<users,Integer> {
    users findByEmail(String email);
    
}

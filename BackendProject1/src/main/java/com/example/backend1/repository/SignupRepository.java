package com.example.backend1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend1.model.Signup;

public interface SignupRepository extends JpaRepository<Signup,String>{

    
}

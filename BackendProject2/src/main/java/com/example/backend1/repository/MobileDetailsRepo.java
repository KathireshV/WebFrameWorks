package com.example.backend1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend1.model.MobileDetails;

public interface MobileDetailsRepo extends JpaRepository<MobileDetails,Integer>{
    
}

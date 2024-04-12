package com.example.backend1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.backend1.model.Mobiles;

public interface MobilesRepo extends JpaRepository<Mobiles,Integer> {

    @Query("SELECT d from Mobiles d WHERE d.mname = :mname")
    List<Mobiles>findByMobName(@Param("mname") String mname);
} 

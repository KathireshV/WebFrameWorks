package com.example.backend1.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import com.example.backend1.model.Signup;
// import com.example.backend1.model.Mobiles;

public interface SignupRepository extends JpaRepository<Signup,String>{
    
    
    
}

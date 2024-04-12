package com.example.backend1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend1.model.MobileDetails;
import com.example.backend1.repository.MobileDetailsRepo;

@Service
public class MobileDetailsService {
    
    @Autowired
    MobileDetailsRepo der;

    public MobileDetails create(MobileDetails md)
    {
        return der.save(md);
    }
}

package com.example.backend1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend1.model.Signup;
import com.example.backend1.repository.SignupRepository;

@Service
public class SignupService {

    @Autowired
    SignupRepository ber;

    public Signup create(Signup sp)
    {
        return ber.save(sp);
    }
    
    public List<Signup> showDetails()
    {
        return ber.findAll();
    }

    public Signup check(String aa)
    {
        return ber.findById(aa).orElse(null);
        
    }
    
    public boolean update(String aa,Signup pp)
    {
        if(this.check(aa)==null)
        {
            return false;
        }
        try{
            ber.save(pp);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }


    public boolean delete(String aa)
    {
        if(check(aa)==null)
        {
            return false;
        }
        ber.deleteById(aa);
        return true;
    }
}
    

package com.example.backend1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend1.model.Mobiles;
import com.example.backend1.repository.MobilesRepo;

@Service
public class MobilesService {
    
    @Autowired
    MobilesRepo mr;

    public Mobiles create(Mobiles sp)
    {
        return mr.save(sp);
    }
    
    public List<Mobiles> showDetails()
    {
        return mr.findAll();
    }

    public Mobiles check(int aa)
    {
        return mr.findById(aa).orElse(null);
        
    }

    public Mobiles getMobById(int id)
    {
        return mr.findById(id).orElse(null);
    }
    
    public boolean update(int aa,Mobiles pp)
    {
        if(this.check(aa)==null)
        {
            return false;
        }
        try{
            mr.save(pp);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }


    public boolean delete(int aa)
    {
        if(check(aa)==null)
        {
            return false;
        }
        mr.deleteById(aa);
        return true;
    }

    public List<Mobiles> getByMobName(String mname)
    {
        return mr.findByMobName(mname);
    }

    
}

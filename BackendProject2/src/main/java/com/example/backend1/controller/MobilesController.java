package com.example.backend1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend1.model.Mobiles;
import com.example.backend1.service.MobilesService;

@RestController
public class MobilesController {

    @Autowired
    MobilesService ms;
    
    @PostMapping("/Mobiles/post")
    public ResponseEntity<Mobiles> addMobile(@RequestBody Mobiles sp)
    {
        Mobiles newuser=ms.create(sp);
        return new ResponseEntity<>(newuser,HttpStatus.CREATED);
    }

    @GetMapping("/Mobiles/viewdetails")
    public ResponseEntity<List<Mobiles>> showMobile()
    {
        List<Mobiles> obj=ms.showDetails();
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }

    @PutMapping("/Mobiles/{mobileid}")
    public ResponseEntity<Mobiles> updateMobile(@PathVariable("mobileid") int id,@RequestBody Mobiles pp)
    {
        if(ms.update(id,pp)==true)
        {
            return new ResponseEntity<>(pp,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(pp,HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/Mobiles/{mobileid}")
    public ResponseEntity<Boolean> deleteMobile(@PathVariable("mobileid") int id)
    {
        if(ms.delete(id)==true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/Mobiles/MobName/{MobName}")
    public ResponseEntity<?>getByName(@PathVariable("MobName") String MobName)
    {
            return new ResponseEntity<>(ms.getByMobName(MobName),HttpStatus.OK);
    }

    
}

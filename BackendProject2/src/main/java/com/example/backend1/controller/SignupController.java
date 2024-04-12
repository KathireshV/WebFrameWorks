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

import com.example.backend1.model.Signup;
import com.example.backend1.service.SignupService;

@RestController
public class SignupController {

    @Autowired
    SignupService bes;
    
    @PostMapping("/Signup/post")
    public ResponseEntity<Signup> add(@RequestBody Signup sp)
    {
        Signup newuser=bes.create(sp);
        return new ResponseEntity<>(newuser,HttpStatus.CREATED);
    }

    @GetMapping("/Signup/viewdetails")
    public ResponseEntity<List<Signup>> show()
    {
        List<Signup> obj=bes.showDetails();
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }

    @PutMapping("/Signup/{username}")
    public ResponseEntity<Signup> up(@PathVariable("username") String uname,@RequestBody Signup pp)
    {
        if(bes.update(uname,pp)==true)
        {
            return new ResponseEntity<>(pp,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(pp,HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/Signup/{username}")
    public ResponseEntity<Boolean> del(@PathVariable("username") String uname)
    {
        if(bes.delete(uname)==true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/Signup/{offset}/{pagesize}/{field}")
    public List<Signup> getsorting(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        return bes.getsort(offset,pagesize,field);
    }
}

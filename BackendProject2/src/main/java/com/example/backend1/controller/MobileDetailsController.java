package com.example.backend1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend1.model.MobileDetails;
import com.example.backend1.model.Mobiles;
import com.example.backend1.service.MobileDetailsService;
import com.example.backend1.service.MobilesService;

@RestController
public class MobileDetailsController {
    
    @Autowired
    MobileDetailsService mds;

    @Autowired
    MobilesService ms;

    @PostMapping("/Mobiles/details/{mid}")
    public ResponseEntity<MobileDetails> add(@RequestBody MobileDetails d,@PathVariable("mid") int mid)
    {
        Mobiles newd = ms.getMobById(mid);
        d.setMobile(newd);
        return new ResponseEntity<>(mds.create(d),HttpStatus.CREATED);
    } 
}

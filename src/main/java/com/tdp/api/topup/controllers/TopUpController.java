package com.tdp.api.topup.controllers;

import com.tdp.api.topup.service.TopUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/top-up")
public class TopUpController {

    @Autowired
    private TopUpService topUpService;


    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        try {

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }

    @PostMapping("/create")
    public  ResponseEntity<?> create(){
        return  new ResponseEntity<>("",HttpStatus.CREATED);
    }

}

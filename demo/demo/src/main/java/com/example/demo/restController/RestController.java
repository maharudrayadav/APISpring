package com.example.demo.restController;

import com.example.demo.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    Service service;
    @GetMapping("/getStudent")
    public ResponseEntity<List<String>>getNames(){
        List<String> studentNames= service.getStudentName();
        return new ResponseEntity<>(studentNames, HttpStatus.OK);
    }
}

package com.mongodb.test.mongodb_test;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestRepository testRepository;
    @GetMapping("/books")
    public List<Test> findAll(){
        return testRepository.findAll();
    }
    @GetMapping("/books/{id}")
    public Test findByName(@PathVariable("id") String age){
        return testRepository.findByage(age);

    }
    }


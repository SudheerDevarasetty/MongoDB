package com.mongodb.test.mongodb_test;

import com.mongodb.test.mongodb_test.Test;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TestRepository extends MongoRepository<Test,String> {

    public Test findBy_id(ObjectId _id);
    public Test findByname(String name);
    public Test findByage(String age);
}

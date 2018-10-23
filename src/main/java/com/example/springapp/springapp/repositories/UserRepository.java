package com.example.springapp.springapp.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.springapp.springapp.models.Users;

public interface UserRepository extends MongoRepository<Users, String>{
	Users findBy_id(ObjectId _id);
}

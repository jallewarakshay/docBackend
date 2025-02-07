package com.dca.micro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dca.micro.entity.Messages;

public interface MessagesRepository extends MongoRepository<Messages, String>{

}

package com.dca.micro.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.micro.entity.Messages;
import com.dca.micro.repository.MessagesRepository;

@Service
public class MessagesServices {

	@Autowired
	MessagesRepository messagesRepository;
	
	public Messages createMessage(Messages message) {
		message.setMessage_id(UUID.randomUUID().toString());
		return messagesRepository.save(message);
	}
	
	public List<Messages> getAllMessages() {
		return messagesRepository.findAll();
	}
	
	public Messages getSingleMessage(String message_id) {
		return messagesRepository.findById(message_id).get();
	}
	
	public void updateMessage(String message_id, Messages message) {
		message.setMessage_id(message_id);
		messagesRepository.save(message);
	}
}

package com.dca.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.micro.entity.Messages;
import com.dca.micro.services.MessagesServices;

@RestController
@RequestMapping("/messages")
public class MessagesController {
	@Autowired
	MessagesServices messagesServices;
	
	@PostMapping
	public ResponseEntity<Messages> createMessages(@RequestBody Messages messages) {
		return ResponseEntity.status(HttpStatus.CREATED).body(messagesServices.createMessage(messages));
	}
	
	@GetMapping
	public ResponseEntity<List<Messages>> getAllMessages() {
		return ResponseEntity.status(HttpStatus.FOUND).body(messagesServices.getAllMessages());
	}
	
	@GetMapping("/{message_id}")
	public ResponseEntity<Messages> getSingleMessage(@PathVariable String message_id) {
		return ResponseEntity.status(HttpStatus.FOUND).body(messagesServices.getSingleMessage(message_id));
	}
	
	@PutMapping("/{message_id}")
	public ResponseEntity<Void> updateMessage(@PathVariable String message_id, @RequestBody Messages messages) {
		messagesServices.updateMessage(message_id, messages);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}

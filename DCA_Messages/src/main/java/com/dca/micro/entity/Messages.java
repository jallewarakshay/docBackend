package com.dca.micro.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class Messages {

	@Id
	private String message_id;
	private String sender_id;
	private String receiver_id;
	private String message_text;
	private LocalDateTime send_at;
	public Messages() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Messages(String message_id, String sender_id, String receiver_id, String message_text,
			LocalDateTime send_at) {
		super();
		this.message_id = message_id;
		this.sender_id = sender_id;
		this.receiver_id = receiver_id;
		this.message_text = message_text;
		this.send_at = send_at;
	}
	public Messages(String sender_id, String receiver_id, String message_text, LocalDateTime send_at) {
		super();
		this.sender_id = sender_id;
		this.receiver_id = receiver_id;
		this.message_text = message_text;
		this.send_at = send_at;
	}
	public String getMessage_id() {
		return message_id;
	}
	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}
	public String getSender_id() {
		return sender_id;
	}
	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}
	public String getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}
	public String getMessage_text() {
		return message_text;
	}
	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}
	public LocalDateTime getSend_at() {
		return send_at;
	}
	public void setSend_at(LocalDateTime send_at) {
		this.send_at = send_at;
	}
	
	
}

package com.dca.micro.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.micro.entity.DCA_User;
import com.dca.micro.service.User_Service;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	User_Service userService;
	
	@GetMapping("/")
	public ResponseEntity<List<DCA_User>> getAllUsers(){
		List<DCA_User> users=userService.getAllUser();
		if(users.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		else {
			return ResponseEntity.status(HttpStatus.FOUND).body(users);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<DCA_User> getUser(@PathVariable String id){
		DCA_User user=userService.getUser(id);
		if(user!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(user);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping("/login")
	public ResponseEntity<DCA_User> getUserByEmailId(@RequestBody Map<String,Object> payload){
		DCA_User user = userService.getByEmailId((String)payload.get("emailId"));
		if(user!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(user);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<DCA_User> createUser(@RequestBody DCA_User user) {
		DCA_User user1=userService.create_User(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	 return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateUser(@RequestBody DCA_User user,@PathVariable String id) {
		userService.updateUser(user, id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}

	

}

package com.dca.micro.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.micro.entity.DCA_User;
import com.dca.micro.repository.userRepository;
import com.dca.micro.service.User_Service;
@Service
public class DCAUserServiceImpl implements User_Service{
	
	@Autowired
	userRepository userRepo;

	@Override
	public DCA_User create_User(DCA_User user) {
//		String id= UUID.randomUUID().toString();
//		user.setUserId(id);
		return userRepo.save(user);
	}

	@Override
	public List<DCA_User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public DCA_User getUser(String userId) {
		return userRepo.findById(userId).get();
	}

	@Override
	public DCA_User updateUser(DCA_User user, String id) {
		DCA_User User =userRepo.findById(id).get();
		user.setUserName(User.getUserName());
		user.setEmailId(User.getEmailId());
		user.setRole(User.getRole());
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(String id) {
		userRepo.deleteById(id); 
	}

	@Override
	public DCA_User getByEmailId(String emailId) {
		return userRepo.findByEmailId(emailId);
		
	}

	
	

}

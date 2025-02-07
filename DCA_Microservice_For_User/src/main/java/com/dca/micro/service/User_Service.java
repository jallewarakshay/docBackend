package com.dca.micro.service;

import java.util.List;

import com.dca.micro.entity.DCA_User;

public interface User_Service {

	DCA_User create_User(DCA_User user);
	List<DCA_User> getAllUser();
	DCA_User getUser(String user_Id);
	DCA_User updateUser(DCA_User user, String id);
	void deleteUser(String id);
	DCA_User getByEmailId(String emailId);
	
	
}

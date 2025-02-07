package com.dca.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dca.micro.entity.DCA_User;

public interface userRepository extends JpaRepository<DCA_User, String>{
	
	
	DCA_User findByEmailId(String emailId);

}

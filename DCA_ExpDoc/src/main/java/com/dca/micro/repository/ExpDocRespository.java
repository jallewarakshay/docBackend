package com.dca.micro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dca.micro.entity.DCA_ExpDoc;

public interface ExpDocRespository extends JpaRepository<DCA_ExpDoc, String>{
	List<DCA_ExpDoc> findByDoctorId(String doctorId);
}

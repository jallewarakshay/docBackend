package com.dca.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dca.entity.DCA_Doctor;

@Service
public interface DCA_service {
	DCA_Doctor create_Doctor(Map<String,Object> payload);

	void update_Doctor(DCA_Doctor doctor, String id);

	void delete_Doctor(String id);

	DCA_Doctor get_Doctor(String id);

	List<DCA_Doctor> getAllDoctor();

	void uploadLicence(String doctorId,MultipartFile file) throws IOException;

}

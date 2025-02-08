package com.dca.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dca.entity.*;

public interface DCA_repo extends JpaRepository<DCA_Doctor, String> {
}
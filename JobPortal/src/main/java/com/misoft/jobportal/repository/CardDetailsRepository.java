package com.misoft.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.CardDetails;

@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Long> {
	
	

}

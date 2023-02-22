package com.misoft.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.MobileBanking;

@Repository
public interface MobileBankingRepository extends JpaRepository<MobileBanking, Long> {

}

package com.misoft.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.AccountInfo;

@Repository
public interface AccountInfoRepository extends JpaRepository<AccountInfo, Long> {

}

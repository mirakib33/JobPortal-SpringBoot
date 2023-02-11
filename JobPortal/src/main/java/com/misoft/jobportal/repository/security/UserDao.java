package com.misoft.jobportal.repository.security;

import com.misoft.jobportal.entity.security.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}

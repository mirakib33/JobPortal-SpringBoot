package com.misoft.jobportal.repository.JWT;

import com.misoft.jobportal.entity.JWT.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}

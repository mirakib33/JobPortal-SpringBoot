package com.misoft.jobportal.repository.JWT;

import com.misoft.jobportal.entity.JWT.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    @Query(value = "SELECT * FROM users u WHERE u.email = :emailOrPhone OR u.phone = :emailOrPhone", nativeQuery = true)
    User findByEmailOrPhone(@Param("emailOrPhone") String emailOrPhone);

}

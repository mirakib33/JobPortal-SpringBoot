package com.misoft.jobportal.repository.JWT;

import com.misoft.jobportal.entity.JWT.Role;
import com.misoft.jobportal.entity.JWT.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleDao extends CrudRepository<Role, Long> {

    Role findByRoleName(String roleName);

}

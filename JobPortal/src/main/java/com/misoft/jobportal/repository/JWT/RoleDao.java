package com.misoft.jobportal.repository.JWT;

import com.misoft.jobportal.entity.JWT.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}

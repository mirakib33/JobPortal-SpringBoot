package com.misoft.jobportal.repository.security;

import com.misoft.jobportal.entity.security.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}

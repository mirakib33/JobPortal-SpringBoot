package com.misoft.jobportal.service.security;


import com.misoft.jobportal.entity.security.Role;
import com.misoft.jobportal.repository.security.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}

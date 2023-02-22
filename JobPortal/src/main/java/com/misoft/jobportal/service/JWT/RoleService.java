package com.misoft.jobportal.service.JWT;


import com.misoft.jobportal.entity.JWT.Role;
import com.misoft.jobportal.repository.JWT.RoleDao;
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

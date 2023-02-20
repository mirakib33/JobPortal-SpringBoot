package com.misoft.jobportal.service;

import com.misoft.jobportal.entity.Signup;
import com.misoft.jobportal.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public Signup authenticate(String email, String password) {
        Signup signup = loginRepository.findByEmail(email);
        if (signup != null && signup.getPassword().equals(password)) {
            return signup;
        }
        return null;
    }

}

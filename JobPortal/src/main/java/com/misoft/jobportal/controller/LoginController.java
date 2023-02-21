package com.misoft.jobportal.controller;

import com.misoft.jobportal.entity.Signup;
import com.misoft.jobportal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Signup> login(@RequestBody Signup signup, HttpSession session) {
        Signup authenticatedUser = loginService.authenticate(signup.getEmail(), signup.getPassword());
        if (authenticatedUser != null) {
            session.setAttribute("signup", authenticatedUser);
            return ResponseEntity.ok(authenticatedUser);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @GetMapping("/logout")
    public ResponseEntity<Void> logout(HttpSession session) {
        session.invalidate();
        return ResponseEntity.ok().build();
    }

}

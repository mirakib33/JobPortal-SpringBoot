package com.misoft.jobportal.controller.JWT;



import com.misoft.jobportal.DTO.JWT.LoginRequest;
import com.misoft.jobportal.entity.JWT.JwtRequest;
import com.misoft.jobportal.entity.JWT.JwtResponse;
import com.misoft.jobportal.service.JWT.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")

//@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class JwtController {

    @Autowired
    private JwtService jwtService;

//    @PostMapping({"/login"})
//    public JwtResponse createJwtToken (@RequestBody JwtRequest jwtRequest) throws Exception {
//
////        (@RequestBody JwtRequest jwtRequest)
////        JwtRequest jwtRequest = new JwtRequest();
//
//        return jwtService.createJwtToken(jwtRequest);
//    }



    @PostMapping({"/signin"})
    public JwtResponse createJwtToken22(@RequestBody LoginRequest loginRequest) throws Exception {
        System.out.println("Test Action");
//        (@RequestBody JwtRequest jwtRequest)
        JwtRequest jwtRequest = new JwtRequest();

        jwtRequest.setEmailOrPhone(loginRequest.getEmailOrPhone());
        jwtRequest.setPassword(loginRequest.getPassword());


        return jwtService.createJwtToken(jwtRequest);
    }

}

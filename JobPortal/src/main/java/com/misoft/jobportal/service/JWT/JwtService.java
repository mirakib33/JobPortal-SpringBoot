package com.misoft.jobportal.service.JWT;


import com.misoft.jobportal.entity.JWT.JwtRequest;
import com.misoft.jobportal.entity.JWT.JwtResponse;
import com.misoft.jobportal.entity.JWT.User;
import com.misoft.jobportal.repository.JWT.UserDao;
import com.misoft.jobportal.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class JwtService implements UserDetailsService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDao userDao;

    @Autowired
    private AuthenticationManager authenticationManager;

    public JwtResponse createJwtToken(JwtRequest jwtRequest) throws Exception {
        String email = jwtRequest.getEmail();
        String password = jwtRequest.getPassword();
        authenticate(email, password);
        UserDetails userDetails = loadUserByUsername(email);
        User user = userDao.findById(email).get();

        String newGeneratedToken = jwtUtil.generateToken(userDetails);
//        String newGeneratedToken = jwtUtil.generateToken(user);

        return new JwtResponse(user, newGeneratedToken);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userDao.findById(email);

        if (user.isPresent()) {
            return new org.springframework.security.core.userdetails.User(
                    user.get().getEmail(),
                    user.get().getPassword(),
                    getAuthority(user.get())
            );
        } else {
            throw new UsernameNotFoundException("User not found with username: " + email);
        }
    }

    private Set<SimpleGrantedAuthority> getAuthority(User user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        user.getRole().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        });
        return authorities;
    }

    private void authenticate(String userName, String userPassword) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, userPassword));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}

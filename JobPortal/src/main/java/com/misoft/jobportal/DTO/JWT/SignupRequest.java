package com.misoft.jobportal.DTO.JWT;

import javax.persistence.Column;
import java.util.Set;

public class SignupRequest {

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private int phone;

    @Column(name="password")
    private String password;

    @Column(name="user_type")
    private String userType;

    @Column(name="user_agreement")
    private String userAgreement;

    private Set<String> role;

//    @NotBlank
//    @Size(min = 6, max = 40)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(String userAgreement) {
        this.userAgreement = userAgreement;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}

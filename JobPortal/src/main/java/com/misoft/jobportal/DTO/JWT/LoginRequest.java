package com.misoft.jobportal.DTO.JWT;

public class LoginRequest {
//    @NotBlank
    private String emailOrPhone;

//    @NotBlank
    private String password;

    public String getEmailOrPhone() {
        return emailOrPhone;
    }

    public void setEmailOrPhone(String emailOrPhone) {
        this.emailOrPhone = emailOrPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

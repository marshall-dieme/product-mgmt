package com.example.productmgmt.dto;


public class ClientDto extends AbstractDto<Long> {

    private String fullName;

    private String email;

    private String tel;

    public ClientDto() {
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }
}
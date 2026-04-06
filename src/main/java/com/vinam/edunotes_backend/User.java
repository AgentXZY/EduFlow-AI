package com.vinam.edunotes_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User{

	@Id
	@GeneratedValue
    private Integer id;
    public String userName;
    private String email;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        id = Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String uname) {
    	userName = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
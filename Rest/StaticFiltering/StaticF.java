package com.example.Rest.StaticFiltering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"pass"})
public class StaticF {
   private String username;
   private String password;

    public StaticF(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StaticF{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

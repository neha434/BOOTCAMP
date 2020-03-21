package com.example.Rest.DynamicFiltering;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("Filter")
public class DynamicF {
    private String username;
    private String password;

    public DynamicF(String username, String password) {
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
        return "DynamicF{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
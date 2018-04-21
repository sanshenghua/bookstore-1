package com.seven.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer user_id;

    private String user_name;
    private String password;
    private String email;
    private Integer is_vip;

    @Temporal(TemporalType.TIME)
    private Date registe_date;
    
    private String state;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIs_vip() {
        return is_vip;
    }

    public void setIs_vip(Integer is_vip) {
        this.is_vip = is_vip;
    }

    public Date getRegiste_date() {
        return registe_date;
    }

    public void setRegiste_date(Date registe_date) {
        this.registe_date = registe_date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", is_vip=" + is_vip +
                ", registe_date=" + registe_date +
                ", state='" + state + '\'' +
                '}';
    }
}

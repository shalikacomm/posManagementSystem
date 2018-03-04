package com.shatec.pos.model;

public class SystemUser {

    private long id;
    private long name;
    private long email;
    private long username;
    private long password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public long getEmail() {
        return email;
    }

    public void setEmail(long email) {
        this.email = email;
    }

    public long getUsername() {
        return username;
    }

    public void setUsername(long username) {
        this.username = username;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SystemUser{" +
                "id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", username=" + username +
                ", password=" + password +
                '}';
    }
}

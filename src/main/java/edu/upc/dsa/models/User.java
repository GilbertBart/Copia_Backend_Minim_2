package edu.upc.dsa.models;

public class User{

    private String username;
    private String email;
    private String password;
    public User() {
    }

    public User(String name, String email, String password) {
        this();
        this.setUsername(name);
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
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
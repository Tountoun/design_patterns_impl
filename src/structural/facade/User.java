package structural.facade;

import java.util.List;

public abstract class User {
    private String username;
    private String password;
    private String email;
    protected List<Authority> authorities = null;
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public abstract void setAuthorities();

    public List<Authority> getAuthorities() {
        return authorities;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}

package structural.facade;

import java.util.Arrays;
import java.util.List;

import static structural.facade.Authority.ACCESS_ADMIN_DASHBOARD;
import static structural.facade.Authority.READ_SIMPLE_USER_PROFIL;

public class Admin extends User implements IUser{
    public Admin(String username, String password, String email) {
        super(username, password, email);
        this.setAuthorities();
    }

    @Override
    public void setAuthorities() {
       this.authorities = Arrays.asList(
          READ_SIMPLE_USER_PROFIL,
          ACCESS_ADMIN_DASHBOARD
       );
    }
    @Override
    public void authorize() {
        // TODO: implement the admin authorization process
        System.out.println("Implementation of admin authorization");
    }
}

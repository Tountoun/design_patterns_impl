package structural.facade;

import java.util.Arrays;
import java.util.List;

import static structural.facade.Authority.*;

public class SimpleUser extends User implements IUser{

    public SimpleUser(String username, String password, String email) {
        super(username, password, email);
        this.setAuthorities();
    }

    @Override
    public void authorize() {
        // TODO: implement the simple user authorization process
        System.out.println("Implementation of simple user authorization");
    }

    @Override
    public void setAuthorities() {
        // We set here all the authorities of a simple once it's created
       this.authorities = Arrays.asList(
               ACCESS_SIMPLE_USER_DASHBORD,
               READ_SIMPLE_USER_PROFIL,
               MODIFY_SIMPLE_USER_PROFIL
       );
    }
}

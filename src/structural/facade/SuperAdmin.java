package structural.facade;

import java.util.Arrays;
import java.util.List;

import static structural.facade.Authority.*;

public class SuperAdmin extends User implements IUser{
    public SuperAdmin(String username, String password, String email) {
        super(username, password, email);
        this.setAuthorities();
    }

    @Override
    public void setAuthorities() {
        this.authorities = Arrays.asList(
           READ_SIMPLE_USER_PROFIL,
           READ_ADMIN_HISTORY,
           GRANT_AUTHORITY,
           REVOKE_AUTHORITY,
           ACCES_SUPER_ADMIN_DASHBOARD
        );
    }
    @Override
    public void authorize() {
        // TODO: implement the super admin authorization process
        System.out.println("Implementation of super admin authorization");
    }
}

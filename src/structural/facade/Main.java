package structural.facade;

public class Main {
    public static void main(String[] args){
        UserAuthorizationManager manager = new UserAuthorizationManager();
        SimpleUser simpleUser = new SimpleUser("user", "user", "simple@gmail.com");
        Admin admin = new Admin("admin", "admin", "admin@gmail.com");
        SuperAdmin superAdmin = new SuperAdmin("super_ad", "super_ad", "super_ad@gmail.com");

        // Use of the manager
        manager.authorizeAdmin(admin);
        manager.authorizeSimpleUser(simpleUser);
        manager.authorizeSuperAdmin(admin);
    }
}

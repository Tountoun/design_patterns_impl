package structural.facade;

public class UserAuthorizationManager {
    private SimpleUser simpleUser = null;
    private Admin admin = null;
    private SuperAdmin superAdmin = null;

    public void authorizeSimpleUser(IUser simpleUser){
        try {
            this.simpleUser = (SimpleUser) simpleUser;
            this.simpleUser.authorize();
        }catch (ClassCastException e){
            System.out.println("The user is not authorized");
        }
    }
    public void authorizeAdmin(IUser admin){
        try {
            this.admin = (Admin) admin;
            this.admin.authorize();
        }catch (ClassCastException e){
            System.out.println("The user is not authorized");
        }

    }
    public void authorizeSuperAdmin(IUser superAdmin){
        try{
            this.superAdmin = (SuperAdmin) superAdmin;
            this.superAdmin.authorize();
        }catch (ClassCastException e){
            System.out.println("The user is not authorized");
        }

    }

}

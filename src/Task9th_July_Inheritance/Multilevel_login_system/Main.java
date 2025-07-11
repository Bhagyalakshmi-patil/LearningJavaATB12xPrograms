package Task9th_July_Inheritance.Multilevel_login_system;

public class Main {
    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin();
        superAdmin.shutdownSystem();
        superAdmin.accessAdminPanel();
        superAdmin.login();

    }
}

//Create a class User with a method login().
//Extend it with a class AdminUser that adds a method accessAdminPanel().
//Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().
//
//Use an object of SuperAdmin to call all three methods.

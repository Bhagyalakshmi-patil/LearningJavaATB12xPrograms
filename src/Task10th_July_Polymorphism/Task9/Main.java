package Task10th_July_Polymorphism.Task9;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.login();
        User user2 = new AdminUser();
        user2.login();
        User user3 = new RegularUser();
        user3.login();
    }
}

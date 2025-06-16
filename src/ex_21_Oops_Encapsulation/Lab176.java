package ex_21_Oops_Encapsulation;

public class Lab176 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass@123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodVwoLogin goodVwoLogin = new GoodVwoLogin("admin","pwd123");
        System.out.println(goodVwoLogin.getPassword());
        System.out.println(goodVwoLogin.getUsername());
        goodVwoLogin.setUsername("Pramod");
        System.out.println(goodVwoLogin.getUsername());
        goodVwoLogin.setPassword("rods@563",true);
        System.out.println(goodVwoLogin.getPassword());
    }
}

class VWOLogin{
    String username;
    String password;

    public VWOLogin(String username,String password) {
        this.username = username;
        this.password = password;
    }
}

class GoodVwoLogin{
    private String username;
    private  String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }else {
            System.out.println("Not allowed");
        }
    }

    public GoodVwoLogin(String username, String password) {
        this.username = username;
        this.password = password;


    }
}

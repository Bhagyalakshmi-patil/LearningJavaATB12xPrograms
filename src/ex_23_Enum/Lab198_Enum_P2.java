package ex_23_Enum;

public class Lab198_Enum_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if(URLS.katalon.equals("Katalon")){
            System.out.println("I want to do somethings");
        }
    }
}
enum URLS{
    google,restassured,katalon,vwo
}

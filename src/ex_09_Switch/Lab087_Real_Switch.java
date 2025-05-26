package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next().toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("..........");
                System.out.println(".....");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                break;
            case "edge":
                System.out.println("Starting the edge");
                break;
            default:
                System.out.println("I have no idea which browser it is ");
                break;
        }
    }

}

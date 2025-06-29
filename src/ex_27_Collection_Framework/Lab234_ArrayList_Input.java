package ex_27_Collection_Framework;

import java.util.*;

public class Lab234_ArrayList_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        String continueInput = "Y";
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name = scanner.next();
            list.add(name);
            scanner.nextLine();

            System.out.println("Do you want to enter another name Y/N");
            continueInput = scanner.nextLine();
        }
        for (String name : list){
            System.out.println(name);
        }
    }
}

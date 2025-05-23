package Task3;

import java.util.Scanner;

public class Triangle_Classifier_HackerRank {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();
         if(N1 == N2 && N1 == N3 && N2 == N3){
             System.out.println("Equilateral Triangle");
         }else if(N1 == N2 || N1 == N3 || N2 == N3) {
             System.out.println("Isosceles Triangle");
        }else {
             System.out.println("Scalene Triangle");
         }
    }

}

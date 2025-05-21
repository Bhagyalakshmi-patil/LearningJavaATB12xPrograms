package Task2;

public class Ternary_minor_adult_senior {
    public static void main(String[] args) {
        int age = 10;
        String a1 = (age >= 18 && age <= 65)? "Adult" : (age < 18 ? "Minor" : "Senior");
        System.out.println(a1);
    }
}

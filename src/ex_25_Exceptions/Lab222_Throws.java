package ex_25_Exceptions;

public class Lab222_Throws {
    public static void main(String[] args) {
        validate_age_for_club(22);
        validate_age_for_club(13);
    }

    static void validate_age_for_club(int age){
        if(age < 18){
            try {
                throw new Exception("Age can't be 18");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Enjoy clubbing");
        }
    }
}

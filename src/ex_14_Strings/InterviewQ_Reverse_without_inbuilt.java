package ex_14_Strings;

public class InterviewQ_Reverse_without_inbuilt {
    public static void main(String[] args) {
        String input = "Pramod";
        for(int i = input.length()-1; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
    }
}

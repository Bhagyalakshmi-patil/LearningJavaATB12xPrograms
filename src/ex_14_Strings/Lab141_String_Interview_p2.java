package ex_14_Strings;

public class Lab141_String_Interview_p2 {
    public static void main(String[] args) {
        String s1 = "Hello";  // 1 string is present in SCP
        String s4 = "Hello";

        String s2 = new String("Hello");  // 2 objects are present in Heap Area
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String => this check the ref location
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        //equals -> checks for the (content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}

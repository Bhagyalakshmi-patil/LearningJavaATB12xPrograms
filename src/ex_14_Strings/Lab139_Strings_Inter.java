package ex_14_Strings;

public class Lab139_Strings_Inter {
    public static void main(String[] args) {
        String s1 = "Hello";  // 1 string is present in SCP
        String s2 = "Hello";
        String s10 = "Hello";
        String s11 = "hello"; // 2 strings are present in scp

        String s4 = new String("Hello");  // 2 objects are present in Heap Area
        String s3 = new String("Hello");
        String s5 = new String("hello"); // 3 objects

        // == -> Comparison -> String => this check the ref location
    }
}

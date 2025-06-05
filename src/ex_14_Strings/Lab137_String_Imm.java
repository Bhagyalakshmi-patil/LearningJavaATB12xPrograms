package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat("world");  // 2 strings are present in String Constant Pool
        System.out.println(s1);
    }
}

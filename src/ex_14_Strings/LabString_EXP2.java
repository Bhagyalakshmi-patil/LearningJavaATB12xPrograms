package ex_14_Strings;

public class LabString_EXP2 {
    public static void main(String[] args) {
        CharSequence s = "Java".subSequence(1,3);
        System.out.println(s);

        String s1 = "Java".substring(2);
        System.out.println(s1);
        String s2 = "Happy".substring(1,3);
        System.out.println(s2);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        String  st = " Ja va ".trim();
        System.out.println(st);

        boolean b1 = " ".isBlank();
        System.out.println(b1);

        String s4 = "ab".repeat(3);
        System.out.println(s4);

        String s11 = String.format("%s = %d","age",24);
        System.out.println(s11);

        long ccount = "a\nb\nc".lines().count();
        System.out.println(ccount);

    }
}

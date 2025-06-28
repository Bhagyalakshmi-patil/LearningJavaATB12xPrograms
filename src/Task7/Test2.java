package Task7;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "Bhagyalakshmi";
        StringBuilder str2 = new StringBuilder("Bhagyalakshmi");
        String str3 = "bhagyalakshmi";
        String str4 = "Hello world";
        String str5 = new String("Bhagyalakshmi");
        String str6 = "Bhagyalakshmi";

        System.out.println("== comparison");
        System.out.println(str1 == str5);
        System.out.println(str1 == str6); // Because these 2 strings are stored in String Constant Pool

        System.out.println("equals comparison");
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println("EqualIgnorecase comparison");
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println("Compare to");
        System.out.println(str1.compareTo(str6));
        System.out.println(str1.compareTo(str5));
        System.out.println(str1.compareTo(str3));
    }
}

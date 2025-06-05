package ex_14_Strings;

public class LabStringExamples {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);
        System.out.println(s.codePointAt(0)); // code point return the unicode character of J

        //CompareToIgnore()  -> Compares the strings ignoring the case differences and return 0 if true and if false it return some integer
        int result = "abc".compareTo("ABC");
        int result2 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result);
        System.out.println(result2);

        int index = "Java".indexOf("a");
        System.out.println(index);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("-","Java","Python"); // join return String
        System.out.println(s11);

        String s12 = "Java".replace('a','o');
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);

    }
}

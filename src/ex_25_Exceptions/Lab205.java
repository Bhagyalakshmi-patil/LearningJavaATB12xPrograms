package ex_25_Exceptions;

public class Lab205 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);

        // unchecked -> Arithmetic Exception , Null pointer Exception
        String name = null;
        name.trim();
    }
}

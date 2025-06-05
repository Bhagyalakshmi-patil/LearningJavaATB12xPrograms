package ex_14_Strings;

public class Lab145_SBIQ {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Bhagyalakshmi");
        stringBuilder.append("Patil");
        System.out.println(stringBuilder);  //2 Strings are created

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);
    }
}

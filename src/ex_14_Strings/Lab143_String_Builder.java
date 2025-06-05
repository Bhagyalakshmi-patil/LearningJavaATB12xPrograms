package ex_14_Strings;

public class Lab143_String_Builder {
    public static void main(String[] args) {
//        String name = "Sonal";
//        System.out.println(name.indexOf(10)); // exception

        StringBuilder stringBuilder = new StringBuilder("pramod");
        StringBuffer stringBuffer = new StringBuffer("Pramod");

        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder.reverse());
    }
}

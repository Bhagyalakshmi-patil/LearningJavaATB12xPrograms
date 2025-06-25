package ex_24_Wrapper_class;

public class Lab203_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "100";
        int aa = 10;

        //String -> wrapper class
        Integer a = Integer.parseInt(num);  //parseX()
        //Double.parseDouble(), parseFloat()

        //String to primitive
        int a_p = Integer.parseInt(num);

        Integer aa3 = Integer.valueOf("100");
        System.out.println(aa3);

        Integer aa10 = 190;
        String s = aa10.toString();
        System.out.println(s instanceof String);
    }
}

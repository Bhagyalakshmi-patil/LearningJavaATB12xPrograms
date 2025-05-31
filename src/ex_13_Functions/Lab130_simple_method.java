package ex_13_Functions;

public class Lab130_simple_method {
    public static void main(String[] args) {
     non_return_type_func();
     int a = return_type_type_func();
        System.out.println(a);
    }
      static void non_return_type_func(){
            System.out.println("Hi, Non Return Type");
        }

      static  int return_type_type_func(){
            System.out.println("Hi,  Return Type");
            return 10;
        }




}

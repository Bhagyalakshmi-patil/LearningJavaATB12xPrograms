package ex_17_OOPs;

public class Lab161 {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2 = null;
        new cat();

        c1.running();
      //  c2.running();
        
    }
}
 class cat{
    String name ;
    void running(){
        System.out.println("Running");
    }
 }
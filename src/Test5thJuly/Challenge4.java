package Test5thJuly;


public class Challenge4 {
    public static void main(String[] args) {
       Integer[] num = {1,2,0,4};
       int r;
       int  r1;
       try{
           r = num[0]/num[4];
           r1 = num[1]/num[2];
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
       }catch (ArithmeticException e1){
           System.out.println(e1.getMessage());
       }
    }
}

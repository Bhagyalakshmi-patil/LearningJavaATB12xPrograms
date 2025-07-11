package Task10th_July_Polymorphism.Task5;

public class Utility {
    public int max(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public int max(int a, int b,int c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
    public double max(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

}

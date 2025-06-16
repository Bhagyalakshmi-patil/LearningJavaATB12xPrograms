package ex_18_Oops_Constructor;

public class Lab162_Oops {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
    }
}

class Baby{
    String name;

    public Baby() {
        //This is called automatically when is object created
        System.out.println("I am called, Object is created");
    }
}

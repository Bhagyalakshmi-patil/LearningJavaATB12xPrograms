package ex_21_Oops_Encapsulation.super_keyword;

public class Lab181 {
    public static void main(String[] args) {

    }
}

class Father{
    Father(){
        System.out.println("DC Father");
    }

    int gold = 10;

    void home(){
        System.out.println("Home Father");
    }
}

class Son extends Father{
    Son(){
        super();
    }

    void  bike(){
        System.out.println("My bike");
    }

    void newHome(){
        super.home();
        System.out.println(super.gold);
        this.bike();
    }
}

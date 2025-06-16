package ex_22_Static;

public class Lab193_Static_P2 {
    public static void main(String[] args) {
        ATB umesh= new ATB(876342563, "Umesh");
        ATB anubha = new ATB(7638636,"Anubha");
        System.out.println(umesh.phone_num);
        System.out.println(anubha.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.m1();
    }
}

class ATB{
    int phone_num;
    String name;
    static String course_name = "ATB";

    public  ATB(int phone_num, String name){
        this.phone_num = phone_num;
        this.name = name;
    }
    void display(){
        System.out.println(this.phone_num + this.name + course_name);
    }
    static void m1(){
        System.out.println("Mark Attendance");
    }
}

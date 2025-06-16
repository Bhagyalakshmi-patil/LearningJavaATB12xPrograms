package ex_22_Static;

public class Lab195_real {
    public static void main(String[] args) {

    }
}
class ATB1{
    {
        System.out.println("IIB  this is called when object is created");
    }
    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    private String phone;
    static String course_name = "ATB12x";

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static void doAssignment(){
        System.out.println("Do Asssignment");
    }
    void readDocuments(){
        System.out.println("Non static method");
        System.out.println(course_name);
    }

}

package Task11th_July_Access_Modifier.P5;

public class Student {
    void showDetails(){
        System.out.println("Showing student Details");
    }
}
class TestDefault{
    public static void main(String[] args) {
        Student st6 = new Student();
        st6.showDetails();
    }
}

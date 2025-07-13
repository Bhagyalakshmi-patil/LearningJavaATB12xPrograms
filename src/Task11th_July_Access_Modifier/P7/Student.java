package Task11th_July_Access_Modifier.P7;

public class Student {
    public void showInfo(){
        System.out.println("Public Access : Student Info");
    }

    public static void main(String[] args) {
        Student st9 = new Student();
        st9.showInfo();
    }
}


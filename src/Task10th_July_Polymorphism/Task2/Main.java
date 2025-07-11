package Task10th_July_Polymorphism.Task2;

public class Main {
    public static void main(String[] args) {
        Printer print = new Printer();
        String p1 = print.printData("Printer is used to print the data");
        int a = print.printData(76);
        float b = print.printData(98.45f);
        System.out.println(p1);
        System.out.println(a);
        System.out.println(b);
    }
}

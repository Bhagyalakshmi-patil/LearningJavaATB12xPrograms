package Task10th_July_Polymorphism.Task6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Animal an1 = new Dog();
        an1.sound();
        Animal an2 = new Cat();
        an2.sound();
        Animal an3 = new Cow();
        an3.sound();
    }
}

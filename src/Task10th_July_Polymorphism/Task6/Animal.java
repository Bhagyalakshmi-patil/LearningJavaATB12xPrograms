package Task10th_July_Polymorphism.Task6;
//Task 1: Animal Sounds
//Description:
//Create a base class Animal with a method sound().
//Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
//Create an object of each class and call sound() to see how overriding provides different outputs using the same method name.



public class Animal {

    public void sound(){
        System.out.println("Sound");
    }
}

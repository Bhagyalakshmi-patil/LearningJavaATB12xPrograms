package Task11th_July_Access_Modifier.P6;


public  class Animal {

    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    protected void doEat(){
        super.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.doEat();
    }

}

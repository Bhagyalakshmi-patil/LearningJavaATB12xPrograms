package ex_26_Object;

public class Sample extends Object{

    @Override
    public String toString() {
        System.out.println("This is coming from object class");
        return null;
    }

    @Override
    public int hashCode() {
        System.out.println("coming from object class");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("coming from object class");
        return true;
    }
}

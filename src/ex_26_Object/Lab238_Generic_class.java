package ex_26_Object;

public class Lab238_Generic_class {
    public static void main(String[] args) {
        GenericClass g1 = new GenericClass(10);
        GenericClass g2 = new GenericClass("Student");
    }
}

//class GenericClass{
//    private Integer data;
//
//    public GenericClass(Integer data) {
//        this.data = data;
//    }
//
//    public Integer getData() {
//        return data;
//    }
//}
class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

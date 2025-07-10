package Task9th_Jun_Constructor;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ashvika",24);
        st1.display();
        Car car1 = new Car("Maruti suzuki",1996,563784);
        car1.carDetails();
        Rectangle rect1 = new Rectangle(5,5);
        rect1.areaRectangle();
        Book bk1 = new Book("Wings of Fire","Abdul kalam",500);
        bk1.bookDetails();
        Mobile mb1 = new Mobile("Nokia");
        mb1.mobileDetails();
        Mobile mb2 = new Mobile("Apple", 75000);
        mb2.mobileDetails();
    }
}

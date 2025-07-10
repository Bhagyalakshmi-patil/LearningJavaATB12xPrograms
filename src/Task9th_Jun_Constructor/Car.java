package Task9th_Jun_Constructor;

public class Car {
    private String brand;
    private int model;
    private double price;

    public Car(String brand, int model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void carDetails(){
        System.out.println("Car Details");
        System.out.println("Brand : "+getBrand());
        System.out.println("Model : "+getModel());
        System.out.println("Price : "+getPrice());
    }
}

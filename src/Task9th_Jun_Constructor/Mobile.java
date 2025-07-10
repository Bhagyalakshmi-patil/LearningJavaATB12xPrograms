package Task9th_Jun_Constructor;

public class Mobile {
    private String brand;
    private double price;

    public Mobile(String brand) {
        this.brand = brand;
    }

    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void mobileDetails(){
        System.out.println("Mobile Details");
        System.out.println("Brand : "+getBrand());
        System.out.println("Price : "+getPrice());
    }
}

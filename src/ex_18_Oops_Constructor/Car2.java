package ex_18_Oops_Constructor;

public class Car2 {
    String model ;
    int year;

    Car2() {
        model = "XXXX";
        year = 1990;
        System.out.println("DC");
    }
        Car2(String model_name,int year_created){
            this.model = model_name;
            this.year = year_created;
        }
    Car2(String model_name){//  Constructor overloading
        this.model = model_name;
    }

    }


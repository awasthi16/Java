
class Car {
 
    String brand;
    int year;

 
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car();

        myCar.brand = "Toyota";
        myCar.year = 2022;

        myCar.displayDetails();
    }
}

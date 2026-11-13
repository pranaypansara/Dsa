public class Car {
    
    String make = "Suzuki";
    String model = "WagonR";
    int year = 2020;
    String color = "blue";
    double price = 500000.00;

    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brake");
    }

    //over-riding toString()
    public String toString(){
        return make+"\n"+model+"\n"+color+"\n"+year+"\n";
    }
}

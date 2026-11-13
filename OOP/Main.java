public class Main {
    
    // toString(): special method that all objects inherit, that returns a string that textually represents the object (returns the address of object in string form)
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        
        //explicitly calling the over-ridden toString() method
        System.out.println(myCar1.toString());
        myCar1.drive();
        myCar1.brake();
        System.out.println();

        //java implicitly calls the over-ridden toString() method
        System.out.println(myCar2);
        myCar2.drive();
        myCar2.brake();
    }
}
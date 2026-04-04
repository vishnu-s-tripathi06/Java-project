public class Car {
    String make="Ford";
    String model="mustang";
    int year=2025;
    double price=58000.99;
    Boolean isRunning=false;
    /*Objects in java have -> Attributes like make , model , price
                           -> They have methods like start , stop
                           -> It is a reference data type */

    void start(){
        System.out.println("Car is running.");
        isRunning=true;
         
    }
    void stop(){
        System.out.println("Car is stopped.");
    }
    void drive(){
        System.out.println("you drive the "+model);
    }
}
 
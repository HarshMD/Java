public class A56_Abstraction {
    public static void  main(String[] args){
        Cars c = new Cars();
        c.fuel();
        c.start();

        Plane p = new Plane();
        p.start();
    }
}

abstract class Vehicle{
    abstract void start();

    void fuel(){
        System.out.println("Fueling the vehicle");
    }
}

class Cars extends Vehicle{
    void start(){
        System.out.println("Starting the car");
    }
}

class Plane extends Vehicle{
    void start(){
        System.out.println("Starting the plane");
    }
}
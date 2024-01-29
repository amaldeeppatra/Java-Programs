class Vehicle{
    String model;
    public void startEngine(){
        System.out.println("Engine is starting...");
    }
    public void stopEngine(){
        System.out.println("Engine is stopping...");
    }
}

class Car extends Vehicle{
    int version;
    String color;
}

class Motorcycle extends Vehicle{
    int mileage;
    public void changeGear(int n){
        System.out.println("Gear has been changed to "+n);
    }
}

public class Assignment {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "audi";
        car1.version = 2024;
        car1.color = "grey";
        System.out.println(car1.model + " " + car1.version + " " + car1.color);
        car1.startEngine();
        car1.stopEngine();
        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.model = "Jawa";
        motorcycle1.mileage = 20;
        System.out.println(motorcycle1.model+" "+motorcycle1.mileage);
        motorcycle1.startEngine();
        motorcycle1.changeGear(1);
        motorcycle1.changeGear(2);
        motorcycle1.changeGear(3);
        motorcycle1.changeGear(2);
        motorcycle1.changeGear(1);
        motorcycle1.stopEngine();
    }
}
package zadanie7;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Harley-Davidson", "Street Rod");
        MotorBike motorBike = new MotorBike("Harley-Davidson", "CVO");
        bike.printInfo();
        motorBike.printInfo();
    }
}

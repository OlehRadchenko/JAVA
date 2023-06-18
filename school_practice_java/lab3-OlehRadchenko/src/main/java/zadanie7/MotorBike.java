package zadanie7;

public class MotorBike extends Bike {
    public MotorBike(String brand, String name) {
        super(brand, name);
        setType("MotorBike");
    }

    @Override
    public void printInfo() {
        System.out.println("MOTOR BIKE");
        super.printInfo();
    }
}

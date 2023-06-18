package zadanie8;

public class Main {
    public static void main(String[] args) {
        CarFactory zbuduj = new CarFactory();
        Car samochod1 = new Car();
        samochod1 = zbuduj.buildCar("Mustang", "Ford");
        System.out.println("Samochod 1: ");
        samochod1.printInfo();
        Car samochod2 = new Car();
        samochod2 = zbuduj.buildCar("Mustang", "Ford");
        System.out.println("\nSamochod 2: ");
        samochod2.printInfo();
    }
}

package zadanie9;

public class Main {
    public static void main(String[] args) {
        Roadster samochod1 = new Roadster(250, 30);
        Roadster samochod2 = new Roadster(250, 30, 400, 200);
        System.out.println("Samochod 1(NOT CRAZY MAN): \n"+samochod1.getTopSpeed()+" - TOP SPEED\n"+samochod1.getAcceleration()+" - ACCELERATION");
        System.out.println("Samochod 2(SO CRAZY MAN): \n"+samochod2.getTopSpeed(true)+" - TOP SPEED\n"+samochod2.getAcceleration(true)+" - ACCELERATION");
    }
}

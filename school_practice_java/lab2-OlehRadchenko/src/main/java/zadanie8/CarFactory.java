package zadanie8;

public class CarFactory {
    public Car buildCar(String model, String brand){
        int los = (int)Math.floor(Math.random()*3);
        String color = "PRZEZROCZYSTY 0_0";
        switch (los){
            case 0:
                color = "czerwony";
                break;
            case 1:
                color = "czarny";
                break;
            case 2:
                color = "bialy";
                break;
            default:
                System.out.println("COS POSZLO NIE TAK 0_0");
        }
        Car wynik = new Car(model, brand, color);
        return wynik;
    }
}

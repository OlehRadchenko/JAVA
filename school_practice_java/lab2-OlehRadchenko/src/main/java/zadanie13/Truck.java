package zadanie13;

public class Truck {
    private String producent, model, color;
    private int ilosc_kol;
    private final double TOP_SPEED = 100;
    //private final double ACCELERATION;
    private double ACCELERATION;

    public Truck() {
        producent = "Freightliner";
        model = "9664";
        ilosc_kol = 6;
        ACCELERATION = 60;
    }
    public Truck(String color){
        this.color = color;
    }
    public void printInfo(){
        System.out.println("Producent: "+producent+"\nModel: "+model+"\nKolor: "+color);
    }
}

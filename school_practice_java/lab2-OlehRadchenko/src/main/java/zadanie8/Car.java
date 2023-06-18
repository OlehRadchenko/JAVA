package zadanie8;

public class Car {
    private String model, brand, color;

    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
    public Car() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printInfo(){
        System.out.println("Model: "+model+"\nBrand: "+brand+"\nKolor: "+color);
    }
}

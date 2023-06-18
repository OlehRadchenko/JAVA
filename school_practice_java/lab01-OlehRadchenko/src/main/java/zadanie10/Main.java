package zadanie10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Podaj promien kuli, a ja tobie policze jej objetosc: ");
            double r = scanner.nextDouble();
            System.out.println("Objetosc kuli o promieniu r = "+r+" jest rowna: "+objetosc_kuli(r)/100);
        }catch (Exception e){
            System.out.println("Wprowadz prawidlowa liczbe!");
            System.exit(666);
        }


    }

    public static double objetosc_kuli(double r){
        double a = 4/3.0;
        return Math.round(a*Math.PI*Math.pow(r, 3)*100);
    }
}
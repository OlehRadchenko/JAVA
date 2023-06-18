package com.company;
import java.util.Scanner;


public class zadanie1 {

    public static void main(String[] args)
    {
        String wybor;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Czy jesteś na jakiejś diecie? \n(napisz wege ,jeżeli jesteś na diecie wegetariańskiej\nnapisz wega ,jeżeli jesteś na diecie wegańskiej\nnapisz bezg ,jeżeli jesteś na diecie bezglutenowej\nnapisz - ,jeżeli nie jesteś na żadnej diecie)\n");
        wybor=keyboard.nextLine();
        switch (wybor)
        {
            case "wege":
                System.out.println("\nRestauracje : \nPizzeria przy Dworcowej\nKawiarnia na Rogu\nWłoskie Specjały\nKuchnia u Szefa");
                break;
            case "wega":
                System.out.println("\nRestauracje : \nKawiarnia na Rogu\nKuchnia u Szefa");
                break;
            case "bezg":
                System.out.println("\nRestauracje :  \nKawiarnia na Rogu\nKuchnia u Szefa");
                break;
            default:
                System.out.println("\nRestauracje : \nLuksusowe burgery u Jarka\nPizzeria przy Dworcowej\nKawiarnia na Rogu\nWłoskie Specjały\nKuchnia u Szefa");
        }
    }
}

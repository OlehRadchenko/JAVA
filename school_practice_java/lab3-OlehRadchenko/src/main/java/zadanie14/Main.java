package zadanie14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PODPUNKT A
        Scanner scanner = new Scanner(System.in);
        double liczba;
        try{
            System.out.print("----------\nPODPUNKT A\n----------\nWprowadz liczbe ktora chcesz odwrocic: ");
            liczba = scanner.nextDouble();
        }catch(Exception e){
            liczba = 0;
            System.out.println("Wprowadziles bledne dane!");
            System.exit(666);
        }
        System.out.println("Liczba odwrotna od "+liczba+" jest to liczba: "+1/liczba);

        //PODPUNKT B
        System.out.print("\n\n----------\nPODPUNKT B\n----------\nWprowadz liczbe ktora chcesz odwrocic: ");
        liczba = scanner.nextDouble();
        System.out.println("Liczba odwrotna od "+liczba+" jest to liczba: "+1/liczba);
    }
}

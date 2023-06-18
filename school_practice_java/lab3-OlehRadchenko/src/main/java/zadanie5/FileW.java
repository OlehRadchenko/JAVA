package zadanie5;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileW {
    private String imie, nazwisko;
    public void czytaj_dane(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        imie = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        nazwisko = scanner.nextLine();
    }

    public void zapisz_dane_do_pliku(){
        try{
            FileWriter fileWriter = new FileWriter("./pliki_dla_zadan/zadanie5/dane.txt", true);
            fileWriter.write("Imie: "+imie+"\nNazwisko: "+nazwisko+"\n\n");
            fileWriter.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }

    public void czytaj_dane_z_pliku(){
        try{
            File file = new File("./pliki_dla_zadan/zadanie5/dane.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}

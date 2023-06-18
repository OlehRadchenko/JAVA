import groovyjarjarantlr4.v4.codegen.model.SrcOp;

import java.util.Scanner;
import java.io.*;

public class zadanie1 {
    public static void main(String[] args) throws IOException {
        String filename;
        String Imie, Nazwisko;
        int numer, wiek;

        Scanner klawiatura= new Scanner(System.in);


        System.out.println("Ile jest osób w klasie?");
        numer=klawiatura.nextInt();

        klawiatura.nextLine();

        System.out.println("Podaj nazwę klasy: ");
        filename=klawiatura.nextLine();

        PrintWriter outputFile = new PrintWriter(filename);

        for(int i=1; i<=numer; i++){
            klawiatura.nextLine();
            System.out.println("Podaj imię ucznia o numerze "+ i);
            Imie=klawiatura.nextLine();
            System.out.println("Podaj nazwisko ucznia o numerze "+ i);
            Nazwisko=klawiatura.nextLine();
            System.out.println("Podaj wiek ucznia o numerze "+ i);
            wiek=klawiatura.nextInt();
            outputFile.println(i + "| \t" + Imie + "| \t" + Nazwisko + "| \t" + wiek);
        }
        outputFile.close();
        System.out.println("Dane zostały zapisane w pliku "+filename);

    }
}

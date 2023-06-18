import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class zadanie2{
    public static void main(String[] args) throws IOException {
        String filename;
        int oceny;
        float ocenas, a,b,c,d,e;
        String ocena;

        Random losowa= new Random();
        Scanner klawiatura= new Scanner(System.in);

        //klawiatura.nextLine();

        System.out.println("Podaj nazwę pliku: ");
        filename=klawiatura.nextLine();

        PrintWriter outputFile = new PrintWriter(filename);
        System.out.println("Ile ocen będzie? ");
        oceny= klawiatura.nextInt();

        for(int i=1; i<=oceny; i++) {
            System.out.println("Ocena numer "+i+":");
            System.out.println("Podaj wynik testu 1:");
            a = klawiatura.nextFloat();
            System.out.println("Podaj wynik testu 2:");
            b = klawiatura.nextFloat();
            System.out.println("Podaj wynik testu 3:");
            c = klawiatura.nextFloat();
            System.out.println("Podaj wynik testu 4:");
            d = klawiatura.nextFloat();
            System.out.println("Podaj wynik testu 5:");
            e = klawiatura.nextFloat();
            ocenas = kalkSred(a, b, c, d, e);
            if (ocenas <= 50) {
                ocena = "ndst";
            } else if (ocenas <= 60 && ocenas > 50) {
                ocena = "dop";
            } else if (ocenas <= 74 && ocenas > 60) {
                ocena = "dst";
            } else if (ocenas <= 89 && ocenas > 74) {
                ocena = "db";
            } else {
                ocena = "bdb";
            }
            outputFile.println("Ocena z testu 1: " + a+"\tocena z testu 2: "+b+"\tocena z testu 3: " + c+"\tocena z testu 4: "+d+"\tocena z testu 5: "+e+"\tocena średnia to:"+ocenas+" w procentach czyli "+ocena);
        }
        outputFile.close();
        System.out.println("Dane zostały zapisane w pliku "+filename);

    }
    static float kalkSred(float a, float b, float c, float d, float e){
        float srednia=(a+b+c+d+e)/5;
        return srednia;
    }
}
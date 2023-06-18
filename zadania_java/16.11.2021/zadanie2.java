import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class zadanie2 {
    public static void main(String[] args) throws IOException {
        String filename;
        int zetony, random, random2, random3;
        int wygrane=0;
        int przegrane=0;

        Random losowa= new Random();
        Scanner klawiatura= new Scanner(System.in);

        //klawiatura.nextLine();

        System.out.println("Podaj nazwę pliku: ");
        filename=klawiatura.nextLine();

        PrintWriter outputFile = new PrintWriter(filename);
        System.out.println("Ile chcesz wpłacić żetonów? ");
        zetony= klawiatura.nextInt();

        for(int i=1; i<=zetony; i++){
            System.out.println(i + " roll:");
            random=losowa.nextInt(7)+1;
            random2=losowa.nextInt(7)+1;
            random3=losowa.nextInt(7)+1;
            System.out.println(random+" "+random2+" "+random3);
            if(random == random2 && random3 == random){
                System.out.println("Wygrałeś!!!");
                wygrane+=1;

            }else{
                przegrane+=1;
            }
            outputFile.println("Roll numer "+i+" miał liczby : "+random+" "+random2+" "+random3);
        }
        outputFile.println("łącznie wygranych: "+wygrane+"\nłącznie przegrane: "+przegrane);
        outputFile.close();
        System.out.println("Dane zostały zapisane w pliku "+filename);

    }
}
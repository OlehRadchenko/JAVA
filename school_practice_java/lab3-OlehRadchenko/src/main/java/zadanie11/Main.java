package zadanie11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj miare kata w radianach: ");
            double radiany = scanner.nextDouble();
            Angle alfa = new Angle(radiany);
            System.out.println("sin: "+alfa.sinus()+"\ncos: "+alfa.cosinus()+"\ntg: "+alfa.tangens()+"\nctg: "+alfa.cotangens()+"\nsec: "+alfa.secans()+"\ncosec :"+alfa.cosecans());
        }catch(Exception e){
            System.out.println("Cos poszlo nie tak ;c \nZaczynasz od nowa");
            System.exit(666);
        }
    }
}

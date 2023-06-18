package zadanie12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj miare kata w radianach: ");
            double radiany = scanner.nextDouble();
            double stopnie = Angle.degree(radiany);
            System.out.println(radiany+" radianow = "+stopnie+" stopni");
            System.out.print("\n\nA teraz podaj miare kata w stopniach: ");
            stopnie = scanner.nextDouble();
            radiany = Angle.radian(stopnie);
            System.out.println(stopnie+" stopni = "+radiany+" radianow");
        }catch(Exception e){
            System.out.println("Cos poszlo nie tak ;c \nZaczynasz od nowa");
            System.exit(666);
        }
    }
}

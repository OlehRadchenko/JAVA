package zadanie5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imie: ");
        String imie = scanner.nextLine();
        if(imie.charAt(imie.length()-1)=='a'){
            System.out.println(imie+" jest kobieta");
        }else{
            System.out.println(imie+" jest mezczyzna");
        }
    }
}

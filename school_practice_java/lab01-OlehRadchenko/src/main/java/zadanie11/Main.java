package zadanie11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Podaj ilosc butelek: ");
            int butelki = scanner.nextInt();
            System.out.print(butelki+" bottels of beer on the wall,"+butelki+" bottels of beer.");
            for(int i=butelki-1; i>0; i--){
                System.out.println("Take one down pass it around, "+i+" bottels of beer on the wall, "+i+" bottels of beer.");
            }
            System.out.println("No more bottels of beer on the wall no more bottels of beer. Go to the store and buy some more");
        }catch (Exception e){
            System.out.println("Wprowadz prawidlowa liczbe!");
            System.exit(666);
        }
    }
}

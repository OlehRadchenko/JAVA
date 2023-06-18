package zadanie2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean czy = true;
        boolean pelnoletni = false;
        boolean pokaz = true;
        int wiek=0;
        while (czy) {
            System.out.print("Podaj ile masz lat: ");
            try {
                wiek = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Podaj prawidlowa liczbe!");
                pokaz = false;
                break;
            }
            if (wiek < 0) {
                System.out.println("Podaj prawidlowa liczbe!");
            } else if(wiek>=18){
                pelnoletni = true;
                czy=false;
            } else{
                pelnoletni = false;
                czy=false;
            }
        }
        while (pokaz) {
            System.out.println("Czy jest pelnoletni: " + pelnoletni);
            pokaz = false;
        }
    }
}

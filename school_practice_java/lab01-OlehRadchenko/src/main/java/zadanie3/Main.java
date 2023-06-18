package zadanie3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slowo;
        boolean palindrom = false;
        System.out.print("Podaj slowo ktore chcesz sprawdzic: ");
        slowo = scanner.nextLine();
        int dlugosc = slowo.length();
        int z = dlugosc-1;
        for(int i=0; i<dlugosc; i++){
            if(slowo.charAt(i) == slowo.charAt(z)) {
                z--;
                palindrom = true;
            }else {
                palindrom = false;
                break;
            }
        }
        if(palindrom){
            System.out.println("Slowo "+slowo+" jest palindromem");
        }else {
            System.out.println("Slowo "+slowo+" nie jest palindromem");
        }
    }
}

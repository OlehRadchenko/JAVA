package zadanie4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean czy=true;
        int liczba=0;
        int silnia=1;
        while (czy){
            System.out.print("Podaj liczbe ktorej chcesz policzyc silnie: ");
            try{
                liczba=scanner.nextInt();
            }catch (Exception e){
                System.out.println("Podaj prawdziwa liczbe");
                System.exit(666);
            }
            if(liczba<0){
                System.out.println("Podaj prawdziwa liczbe");
            } else if (liczba==0) {
                silnia=1;
                czy=false;
            } else {
                for(int i=1; i<=liczba; i++){
                    silnia*=i;
                }
                czy=false;
            }
        }
        System.out.println("Silnia liczby "+liczba+" = "+silnia);
    }
}

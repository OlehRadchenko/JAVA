package zadanie6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
            try {
                System.out.print("Podaj liczbe a: ");
                a = scanner.nextInt();
                System.out.print("Podaj liczbe b: ");
                b = scanner.nextInt();
                System.out.print("Podaj liczbe c: ");
                c = scanner.nextInt();
                if(a>b && a>c){
                    System.out.println("Najwieksza liczba jest: a = "+a);
                }else if (b>a && b>c) {
                    System.out.println("Najwieksza liczba jest: b = "+b);
                }else{
                    System.out.println("Najwieksza liczba jest: c = "+c);
                }
            } catch (Exception e) {
                System.out.print("Wpisz poprawna liczbe");
                System.exit(666);
            }
        /*try {      //WERSJA Z DODATKOWĄ ZMIENNĄ()
            int[] tab = new int[3];
            int max=-20000;
            System.out.print("Podaj liczbe a: ");
            tab[0] = scanner.nextInt();
            System.out.print("Podaj liczbe b: ");
            tab[1] = scanner.nextInt();
            System.out.print("Podaj liczbe c: ");
            tab[2] = scanner.nextInt();
            for(int i=0; i<3; i++){
                if(tab[i]>max){
                    max=tab[i];
                }
            }
            System.out.println(max);
        } catch (Exception e) {
            System.out.print("Wpisz poprawna liczbe");
            System.exit(666);
        }*/
    }
}

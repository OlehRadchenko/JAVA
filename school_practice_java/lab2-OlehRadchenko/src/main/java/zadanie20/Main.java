package zadanie20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Wylosuje liczbe od 0 do 100 a ty musisz zgadnac!!");
            int los = (int) Math.floor(Math.random() * 100);
            boolean czy = true;
            int podejscie = 1;
            int odp;
            while (czy) {
                System.out.print("Podejscie nr: "+podejscie+"\nLiczba: ");
                odp = scanner.nextInt();
                if(odp>los){
                    System.out.println("Moja liczba jest mniejsza ;)");
                    podejscie++;
                }else if(odp<los){
                    System.out.println("Moja liczba jest wieksza ;0");
                    podejscie++;
                }else{
                    System.out.println("Brawo! Udalo ci sie! I to tylko w "+podejscie+" podejsciach");
                    czy=false;
                }
            }
        }catch(Exception e){
            System.out.println("Cos poszlo nie tak ;c");
            System.exit(666);
        }
    }
}

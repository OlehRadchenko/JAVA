package zadanie12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Jaka wysokosc piramidy chcesz: ");
            int wysokosc = scanner.nextInt();
            for(int i=1; i<=wysokosc; i++){
                for(int k=i; k<=wysokosc; k++){
                    System.out.print(" ");
                }
                for(int j=0; j<i*2; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }catch (Exception e){
            System.out.println("Wprowadz prawidlowa liczbe!");
            System.exit(666);
        }
    }
}

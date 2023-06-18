package zadanie15;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Podaj liczbe a: ");
            int a = scanner.nextInt();
            System.out.print("Podaj liczbe b: ");
            int b = scanner.nextInt();
            if(b>0){
                for(int i=0; i<b; i++){
                    a++;
                }
                System.out.println(a+" + "+b+" = "+a);
            }else if (b<0) {
                for(int i=0; i>b; i--){
                    a--;
                }
                System.out.println(a+" + "+b+" = "+a);
            }else{
                System.out.println(a+" + "+b+" = "+a);
            }
        }catch (Exception e){
            System.out.println("Wprowadz prawidlowa liczbe!");
            System.exit(666);
        }
    }
}
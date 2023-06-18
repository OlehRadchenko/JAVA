package zadanie19;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Podaj swoj wzrost: ");
            double wzrost = scanner.nextDouble();
            System.out.print("Podaj swoja wage: ");
            double waga = scanner.nextDouble();
            double BMI = BMI(wzrost, waga);
            System.out.println("Twoje BMI to: "+BMI);
            if(BMI<=24.9 && BMI>=18.5){
                System.out.println("I jest ono w porzadku");
            }else if(BMI>24.9){
                System.out.println("I jest ono za duze. Czas na lekarza");
            }else{
                System.out.println("I jest ono za male. Czas na lekarza");
            }
        }catch(Exception e){
            System.out.println("Cos zle podales -_-");
            System.exit(666);
        }
    }
    public static double BMI(double wzrost, double waga){
        return waga/(Math.pow(wzrost, 2));
    }
}

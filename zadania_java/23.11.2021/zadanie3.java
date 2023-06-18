import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class zadanie3 {
    static void wygral(int a, int b){
    if(a==1 && b==3){
        System.out.println("Brawo! Wygrałeś!!");
    }else if(a==3 && b==2){
        System.out.println("Brawo! Wygrałeś!!");
    }else if(a==2 && b==1){
        System.out.println("Brawo! Wygrałeś!!");
    }else if(b==1 && a==3){
        System.out.println("Komputer wygrał ;c");
    }else if(b==3 && a==2){
        System.out.println("Komputer wygrał ;c");
    }else if(b==2 && a==1){
        System.out.println("Komputer wygrał ;c");
    }else{
        System.out.println("Nikt nie wygrał ;o");
    }
    }

    public static void main(String[] args) {
        int liczba, liczba1;
        Random losowa = new Random();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Co wybierzesz ty?\n(1 - kamień\n2 - papier\n3 - nożyce)");
        liczba= klawiatura.nextInt();
        switch(liczba){
            case 1:{
                System.out.println("Wybrałeś kamień");
                break;
            }
            case 2:{
                System.out.println("Wybrałeś papier");
                break;
            }
            case 3:{
                System.out.println("Wybrałeś nożyce");
                break;
            }
            default:{
                System.out.println("Nie poprawna wartość ;c");
            }
        }
        liczba1= losowa.nextInt(3)+1;
        switch(liczba1){
            case 1:{
                System.out.println("A ja wybrałem kamień");
                break;
            }
            case 2:{
                System.out.println("A ja wybrałem papier");
                break;
            }
            case 3:{
                System.out.println("A ja wybrałem nożyce");
                break;
            }
        }
        wygral(liczba,liczba1);

    }
}

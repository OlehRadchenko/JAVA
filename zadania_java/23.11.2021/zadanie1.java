import java.sql.SQLOutput;
import java.util.Scanner;

public class zadanie1 {
    static void dodaj(int a, int b, int c, int d){
        int wynik = a+b+c+d;
        System.out.println("Dodawanie liczb: "+a+", "+b+", "+c+", "+d+" = "+wynik);
    }
    static void odejmij(int a, int b, int c, int d){
        int wynik = a-(b+c+d);
        System.out.println("Odejmowanie liczb: "+a+", "+b+", "+c+", "+d+" = "+wynik);
    }
    static void podziel(int a, int b, int c, int d){
        int wynik = a/b/c/d*100;
        System.out.println("Dzielenie liczb(z pomnozeniem razy 100): "+a+", "+b+", "+c+", "+d+" = "+wynik);
    }
    static void pomnoz(int a, int b, int c, int d){
        int wynik = a*b*c*d;
        System.out.println("Mnozenie liczb: "+a+", "+b+", "+c+", "+d+" = "+wynik);
    }
    public static void main(String[] args) {
        int liczba1, liczba2, liczba3, liczba4, wybor;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczby które mam zmodyfikować:");
        liczba1=klawiatura.nextInt();
        System.out.println("");
        liczba2=klawiatura.nextInt();
        System.out.println("");
        liczba3=klawiatura.nextInt();
        System.out.println("");
        liczba4=klawiatura.nextInt();
        System.out.println("\nA teraz powiedz co mam z tym zrobić\n(1-dodać\n2-odjąć\n3-podzielić\n4-pomnożyć)");
        wybor= klawiatura.nextInt();
        switch(wybor){
            case(1):{
                dodaj(liczba1,liczba2,liczba3,liczba4);
                break;
            }
            case(2):{
                odejmij(liczba1,liczba2,liczba3,liczba4);
                break;
            }
            case(3):{
                podziel(liczba1,liczba2,liczba3,liczba4);
                break;
            }
            case(4):{
                pomnoz(liczba1,liczba2,liczba3,liczba4);
                break;
            }
            default:{
                System.out.println("Nie poprawna wartość :c");
            }
        }
    }
}

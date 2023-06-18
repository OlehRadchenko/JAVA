package zadanie13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        double liczba;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj lancuch znakow a ja przekonwertuje go w liczbe zmienno-przecinkowa: ");
        try{
            a = scanner.nextLine();
            liczba = Double.parseDouble(a);
            System.out.println("Liczba zmienno-przecinkowa to: "+liczba);
        }
        catch (Exception e){
            //System.out.println(e.getMessage());
            System.out.println("Hmmm, tego sie nie da przekonwertowac -_-"); //Zawsze jest taki sam blad wiec idk jak je rozdzielic
            if(e.getMessage().equals("multiple points")){
                System.out.println("Przyczyna: Masz za duzo kropek...");
            }else{
                System.out.println("Przczyna: Nie wpisales prawdziwej liczby(zamien przecinek na kropke)");
            }
        }

    }
}

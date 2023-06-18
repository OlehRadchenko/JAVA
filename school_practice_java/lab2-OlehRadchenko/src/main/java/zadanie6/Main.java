package zadanie6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            Student[] uczen = new Student[100];
            System.out.println("Ile chcesz uczniow dodac? ");
            int ilosc, usun;
            ilosc = scanner.nextInt();
            if(ilosc>99){
                System.out.println("Za duzo ;c");
                System.exit(666);
            }
            for(int i=0; i<ilosc; i++){
                String imie, nazwisko, miasto;
                int wiek;
                System.out.print("Podaj imie ucznia: ");
                scanner.nextLine();
                imie = scanner.nextLine();
                System.out.print("Podaj nazwisko ucznia: ");
                nazwisko = scanner.nextLine();
                System.out.print("Podaj miasto zamieszkania ucznia: ");
                miasto = scanner.nextLine();
                System.out.print("Podaj wiek ucznia: ");
                wiek = scanner.nextInt();
                if(wiek<=0){
                    System.out.println("Cos zle wprowadziles ;c");
                    System.exit(666);
                }
                uczen[i] = new Student(imie,nazwisko,miasto,wiek);
            }
            System.out.println("To teraz wyswietlam cala tabelke: \n");
            System.out.println("ID/\tImie/\tNazwisko/\tMiasto zamieszkania/\tWiek");
            for(int i=0; i<ilosc; i++){
                System.out.print(i+"/\t");
                uczen[i].printBasicData();
            }
            System.out.println("Kogo chcesz usunac?(Podaj ID)");
            usun = scanner.nextInt();
            if(usun<0 || usun>ilosc){
                System.out.println("Cos zle wprowadziles ;c");
                System.exit(666);
            }
            ilosc--;
            for(int i=usun; i<ilosc; i++){
                uczen[i] = uczen[i+1];
            }
            System.out.println("To teraz wyswietlam zmodyfikowana tabelke: \n");
            System.out.println("ID/\tImie/\tNazwisko/\tMiasto zamieszkania/\tWiek");
            for(int i=0; i<ilosc; i++){
                System.out.print(i+"/\t");
                uczen[i].printBasicData();
            }

        }catch(Exception e){
            System.out.println("Cos zle wprowadziles ;c");
            System.exit(666);
        }
    }
}

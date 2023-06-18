package zadanie3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box a = new Box();
        float odp;
        try {
            System.out.print("Podaj wysokosc box'u a: ");
            odp = scanner.nextFloat();
            a.setWysokosc(odp);
            if(odp <= 0){
                System.out.println("Nie moze byc ujemne lub rowne 0 ;c\nZaczynasz od nowa");
                System.exit(666);
            }
            System.out.print("Podaj szerokosc box'u a: ");
            odp = scanner.nextFloat();
            a.setSzerokosc(odp);
            if(odp <= 0){
                System.out.println("Nie moze byc ujemne lub rowne 0 ;c\nZaczynasz od nowa");
                System.exit(666);
            }
        }catch(Exception e){
            System.out.println("Cos poszlo nie tak ;c\nZaczynasz od nowa");
            System.exit(666);
        }

        Box b = new Box();
        try {
            System.out.print("Podaj wysokosc box'u b: ");
            odp = scanner.nextFloat();
            b.setWysokosc(odp);
            if(odp <= 0){
                System.out.println("Nie moze byc ujemne lub rowne 0 ;c\nZaczynasz od nowa");
                System.exit(666);
            }
            System.out.print("Podaj szerokosc box'u b: ");
            odp = scanner.nextFloat();
            b.setSzerokosc(odp);
            if(odp <= 0){
                System.out.println("Nie moze byc ujemne lub rowne 0 ;c\nZaczynasz od nowa");
                System.exit(666);
            }
        }catch(Exception e){
            System.out.println("Cos poszlo nie tak ;c\nZaczynasz od nowa");
            System.exit(666);
        }

        Box box = new Box();
        Box join = new Box();
        join = box.joinDiagonal(a,b);
        System.out.println("Wymiary zlaczonych tych pudelek diagonalnie to: \nWysokosc = "+join.getWysokosc()+"\nSzerokosc = "+join.getSzerokosc());

        join = box.joinHorizontal(a,b);
        System.out.println("Wymiary zlaczonych tych pudelek poziomo to: \nWysokosc = "+join.getWysokosc()+"\nSzerokosc = "+join.getSzerokosc());

        join = box.joinVertical(a,b);
        System.out.println("Wymiary zlaczonych tych pudelek pionowo to: \nWysokosc = "+join.getWysokosc()+"\nSzerokosc = "+join.getSzerokosc());
    }
}

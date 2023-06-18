package zadanie1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numer_mies = 0;
        boolean czy = true;

        while (czy) {
            System.out.print("Podaj numer miesiaca: ");
            try {
                numer_mies = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Podaj prawidlowa liczbe!");
                break;
            }
            if (numer_mies < 1 || numer_mies > 12) {
                System.out.println("Podaj prawidlowa liczbe!");
            } else {
                czy=false;
                switch (numer_mies) {
                    case 1:
                        System.out.println(numer_mies + " miesiac jest to: styczen");
                        break;
                    case 2:
                        System.out.println(numer_mies + " miesiac jest to: luty");
                        break;
                    case 3:
                        System.out.println(numer_mies + " miesiac jest to: marzec");
                        break;
                    case 4:
                        System.out.println(numer_mies + " miesiac jest to: kwiecien");
                        break;
                    case 5:
                        System.out.println(numer_mies + " miesiac jest to: maj");
                        break;
                    case 6:
                        System.out.println(numer_mies + " miesiac jest to: czerwiec");
                        break;
                    case 7:
                        System.out.println(numer_mies + " miesiac jest to: lipiec");
                        break;
                    case 8:
                        System.out.println(numer_mies + " miesiac jest to: sierpien");
                        break;
                    case 9:
                        System.out.println(numer_mies + " miesiac jest to: wrzesien");
                        break;
                    case 10:
                        System.out.println(numer_mies + " miesiac jest to: październik");
                        break;
                    case 11:
                        System.out.println(numer_mies + " miesiac jest to: listopad");
                        break;
                    case 12:
                        System.out.println(numer_mies + " miesiac jest to: grudzien");
                        break;
                }
            }
        }
    }
}

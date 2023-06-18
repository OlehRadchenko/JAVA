import java.util.Scanner;


public class zadanie2 {

    public static void main(String[] args) {
        String wybor;
        int wynik;
        Scanner keyboard = new Scanner(System.in);
        //Pytanie1 ---------------------------------------------------------------------------
        System.out.print("Temat pytań: Co wiesz na temat Azji\nPytanie 1. Które ze zwierząt zagrożonych wyginięciem żyje tylko na obszarze Azji?\na) Pekari Wagnera\nb) Panda\nc) Fossa\nd) Hipopotam karłowy");
        wybor = keyboard.nextLine();
        switch (wybor) {
            case "a":
                System.out.println("Żle, poprawna odpowiedź:b\n");
                break;
            case "b":
                System.out.println("Brawo odpowiedziałeś dobrze!!!\n");
                wynik = wynik + 1;
                break;
            case "c":
                System.out.println("Żle, poprawna odpowiedź:b\n");
                break;
            case "d":
                System.out.println("Żle, poprawna odpowiedź:b\n");
                break;

            default:
                System.out.println("Wprowadziłeś błędbną wartość");
        }
        //Pytanie2 ---------------------------------------------------------------
        System.out.print("Pytanie 2. Ile stref klimatycznych występuje na terenie Azji?\na) Strefa klimatów umiarkowanych\nb) Strefa klimatów zwrotnikowych\nc) Wszystkie\nd) Strefa klimatów równikowych");
        wybor = keyboard.nextLine();
        switch (wybor) {
            case "a":
                System.out.println("Żle, poprawna odpowiedź:c\n");
                break;
            case "b":
                System.out.println("Żle, poprawna odpowiedź:c\n");
                break;
            case "c":
                System.out.println("Brawo odpowiedziałeś dobrze!!!\n");
                wynik = wynik + 1;
                break;
            case "d":
                System.out.println("Żle, poprawna odpowiedź:c\n");
                break;

            default:
                System.out.println("Wprowadziłeś błędbną wartość");
        }
        //Pytanie3 ---------------------------------------------------------------
        System.out.print("Pytanie 3. Czy można nazwać Azje \"najmłodzym kontynentem\"\na) Nie\nb) Tak");
        wybor = keyboard.nextLine();
        switch (wybor) {
            case "a":
                System.out.println("Brawo odpowiedziałeś dobrze!!!\n");
                wynik += 1;
                break;
            case "b":
                System.out.println("Żle, poprawna odpowiedź:a\n");
                break;
            default:
                System.out.println("Wprowadziłeś błędbną wartość");
        }
        //Pytanie4 ---------------------------------------------------------------
        System.out.print("Pytanie 4. Najgłębsze jezioro w Azji to: \na) Morze Kaspijskie\nb) Aralskie\nc) Morze Martwe\nd) Bajkał");
        wybor = keyboard.nextLine();
        switch (wybor) {
            case "a":
                System.out.println("Żle, poprawna odpowiedź:d\n");
                break;
            case "b":
                System.out.println("Żle, poprawna odpowiedź:d\n");
                break;
            case "c":
                System.out.println("Żle, poprawna odpowiedź:d\n");
                break;
            case "d":
                System.out.println("Brawo odpowiedziałeś dobrze!!!\n");
                wynik += 1;
                break;

            default:
                System.out.println("Wprowadziłeś błędbną wartość");
        }
        //Pytanie5 ---------------------------------------------------------------
        System.out.print("Pytanie 5. Ile spośród 14 najwyższych na świecie szczytów znajduje się w Azji? \na) Połowa\nb) Jedna trzecia\nc) Wszystkie\nd) Jedna czwarta");
        wybor = keyboard.nextLine();
        switch (wybor) {
            case "a":
                System.out.println("Żle, poprawna odpowiedź:c\n");
                break;
            case "b":
                System.out.println("Żle, poprawna odpowiedź:c\n");
                break;
            case "c":
                System.out.println("Brawo odpowiedziałeś dobrze!!!\n");
                wynik += 1;
                break;
            case "d":
                System.out.println("Żle, poprawna odpowiedź:c\n");
                break;

            default:
                System.out.println("Wprowadziłeś błędbną wartość");
        }
        //Pytanie6 ---------------------------------------------------------------
        System.out.print("Pytanie 6. Terytorium którego państwa zajmuje najwięcej powierzchni Azji \na) Rosji\nb) Kazachstanu\nc) Indii\nd) Chin");
        wybor = keyboard.nextLine();
        switch (wybor) {
            case "a":
                System.out.println("Brawo odpowiedziałeś dobrze!!!\n");
                wynik += 1;
                break;
            case "b":
                System.out.println("Żle, poprawna odpowiedź:a\n");
                break;
            case "c":
                System.out.println("Żle, poprawna odpowiedź:a\n");
                break;
            case "d":
                System.out.println("Żle, poprawna odpowiedź:a\n");
                break;

            default:
                System.out.println("Wprowadziłeś błędbną wartość");
        }
        System.out.println("\n\nTwój wynik to: " + wynik);
    }
}

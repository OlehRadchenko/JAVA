package zadanie18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Main {

    public static void main(String[] args){

        String pesel = "94011341966";

        if(!PeselValidator.isValid(pesel)) return;

        /* kostruktor przyjmuje numer PESEL */
        Person person = new Person(pesel);

        person.setName("Jan");
        person.setSurname("Kowalski");
        System.out.println("imie: " + person.getName());
        System.out.println("nazwisko: " + person.getSurname());
        System.out.println("nr pesel: " + person.getPeselNumber());

        System.out.println("plec: " +  person.getGender()); //jak

        System.out.println("Urodzony:");
        System.out.println("Rok: " + person.getDateOfBirth().getYear());
        System.out.println("Miesiac: " +person.getDateOfBirth().getMonth().toString()); //powinien wypisac "JANUARY"
        System.out.println("Dzien: " +person.getDateOfBirth().getDayOfMonth());

        // powinien wypisac którąś z wartości: MONDAY, TUESDAY, WEDNSEDAY...
        System.out.println("Dzien tygodnia: " +person.getDateOfBirth().getDayOfWeek().toString());
    }
}
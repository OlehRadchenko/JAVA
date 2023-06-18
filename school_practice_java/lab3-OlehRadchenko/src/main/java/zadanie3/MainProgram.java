package zadanie3;

import java.time.LocalDate;

public class MainProgram {

    public static void main(String[] args){
        Student janekKowalski = new Student("janeczek", "kowalski", LocalDate.of(1999, 01, 03), Gender.MALE);


        janekKowalski.setName("Jan");
        janekKowalski.setSurname("Kowalski");
        janekKowalski.setIndex("s00001");
        System.out.println(janekKowalski.getName()
                +" " + janekKowalski.getSurname()
        +" " +janekKowalski.getDateOfBirth()
        +" " +janekKowalski.getGender()
        +" " +janekKowalski.getIndex());


        Lecturer aniaNowak = new Lecturer("ania", "nowak", LocalDate.of(1980, 05, 10), Gender.FEMALE);
        aniaNowak.setName("Anna");
        aniaNowak.setSurname("Nowak");
        aniaNowak.setTitle("Phd");

       System.out.println(aniaNowak.getName()
                +" " + aniaNowak.getSurname()
                +" " +aniaNowak.getDateOfBirth()
                +" " +aniaNowak.getGender()
                +" " +aniaNowak.getTitle());

        Scholar fryderykNowak = new Scholar("fryderyk", "nowak", LocalDate.of(1997, 05, 15), Gender.MALE);

        fryderykNowak.setName("Fryderyk");
        fryderykNowak.setSurname("Nowak");
        fryderykNowak.setIndex("s00001");
        fryderykNowak.setScholarship(500.00);
        System.out.println(fryderykNowak.getName()
                +" " + fryderykNowak.getSurname()
                +" " +fryderykNowak.getDateOfBirth()
                +" " +fryderykNowak.getGender()
                +" " +fryderykNowak.getIndex()
                +" " +fryderykNowak.getScholarship());

        PersonBase janeczek = janekKowalski;
        PersonBase aniusia = aniaNowak;
        PersonBase fredek = fryderykNowak;



        fredek.setName("Fryderyk");
        fredek.setSurname("Nowak");
        System.out.println(fredek.getName()
                +" " + fredek.getSurname()
                +" " +fredek.getDateOfBirth()
                +" " +fredek.getGender());

        aniusia.setName("Anna");
        aniusia.setSurname("Nowak");
        System.out.println(aniusia.getName()
                +" " + aniusia.getSurname()
                +" " +aniusia.getDateOfBirth()
                +" " +aniusia.getGender());


        janeczek.setName("Jan");
        janeczek.setSurname("Kowalski");
        System.out.println(janeczek.getName()
                +" " + janeczek.getSurname()
                +" " +janeczek.getDateOfBirth()
                +" " +janeczek.getGender());

//        PersonBase osoba =
//                new PersonBase("name", "surname", LocalDate.of(2000, 05, 15), Gender.MALE);
        //-> powyższa linijka powinna zwracać błąd kompilacji - jeśli tak jest zakomentuj ją (ta linijka ma NIE działać).


        fredek.printPersonDetails();
        aniusia.printPersonDetails();
        janeczek.printPersonDetails();

        System.out.println("KONIEC");

    }
    public enum Gender{
        MALE, FEMALE
    }
}
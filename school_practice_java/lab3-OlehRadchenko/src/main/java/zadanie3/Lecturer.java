package zadanie3;

import java.time.LocalDate;

public class Lecturer extends PersonBase {
    private String title;
    public Lecturer(String name, String surname, LocalDate dateOfBirth, MainProgram.Gender gender) {
        super(name, surname, dateOfBirth, gender);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printPersonDetails(){
        System.out.println("Tytul: "+title+"\nImie: "+getName()+"\nNazwisko: "+getSurname()+"\nPlec: "+getGender()+"\nUrodzony: "+getDateOfBirth());
    }

}

package zadanie3;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends PersonBase {
    private String indexNumber;

    public Student(String name, String surname, LocalDate dateOfBirth, MainProgram.Gender gender) {
        super(name, surname, dateOfBirth, gender);
    }

    public String getIndex() {
        return indexNumber;
    }

    public void setIndex(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void printPersonDetails(){
        System.out.println("ID nr: "+indexNumber+"\nImie: "+getName()+"\nNazwisko: "+getSurname()+"\nPlec: "+getGender()+"\nUrodzony: "+getDateOfBirth());
    }
}

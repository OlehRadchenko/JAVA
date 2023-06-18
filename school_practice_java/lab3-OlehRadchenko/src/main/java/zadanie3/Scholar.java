package zadanie3;

import java.time.LocalDate;

public class Scholar extends PersonBase {
    private String indexNumber;
    private double scholarship;

    public Scholar(String name, String surname, LocalDate dateOfBirth, MainProgram.Gender gender) {
        super(name, surname, dateOfBirth, gender);
    }


    public String getIndex() {
        return indexNumber;
    }

    public void setIndex(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public void printPersonDetails(){
        System.out.println("ID nr: "+indexNumber+"\nImie: "+getName()+"\nNazwisko: "+getSurname()+"\nPlec: "+getGender()+"\nUrodzony: "+getDateOfBirth()+"\nStypendium: "+scholarship);
    }
}

package zadanie18;

import java.time.LocalDate;

public class Person {
    private String peselNumber, name, surname, gender;
    private LocalDate dateOfBirth;

    public String getPeselNumber() {
        return peselNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        if(name.charAt(name.length()-1)=='a'){
            gender="kobieta";
        }else{
            gender="mezczyzna";
        }

        return gender;
    }

    public LocalDate getDateOfBirth() {
        int PESEL[] = new int[11];
        for(int i=0; i<11; i++){
            PESEL[i] = peselNumber.charAt(i)-'0';
        }
        int year, month, day;
        year = 10 * PESEL[0];
        year += PESEL[1];
        month = 10 * PESEL[2];
        month += PESEL[3];
        day = 10 * PESEL[4];
        day += PESEL[5];
        if (month > 80 && month < 93) {
            year += 1800;
        }
        else if (month > 0 && month < 13) {
            year += 1900;
        }
        else if (month > 20 && month < 33) {
            year += 2000;
        }
        else if (month > 40 && month < 53) {
            year += 2100;
        }
        else if (month > 60 && month < 73) {
            year += 2200;
        }

        if (month > 80 && month < 93) {
            month -= 80;
        }
        else if (month > 20 && month < 33) {
            month -= 20;
        }
        else if (month > 40 && month < 53) {
            month -= 40;
        }
        else if (month > 60 && month < 73) {
            month -= 60;
        }
        dateOfBirth = LocalDate.of(year, month, day);
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person(String peselNumber) {
        this.peselNumber = peselNumber;
    }
}


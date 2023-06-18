package zadanie6;

public class Employee {
    private String name, surname;

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo(){
        System.out.println("Imie: "+name+"\nNazwisko: "+surname);
    }
}

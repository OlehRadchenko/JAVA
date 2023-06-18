package zadanie2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Person {
    private int ID;
    private String imie;
    private LocalDate urodzinki;
    ArrayList<Address> addresses = new ArrayList<>();

    public void setName(String imie) {
        this.imie = imie;
    }

    public void setDateOfBirth(LocalDate urodzinki) {
        this.urodzinki = urodzinki;
    }

    public void setId(int ID){
        this.ID = ID;
    }

    public LocalDate getDateOfBirth() {
        return urodzinki;
    }

    public Person(int ID, String imie, LocalDate data){
        this.ID = ID;
        this.imie = imie;
        this.urodzinki = data;
    }
    public Person copy(){
        return new Person(this.ID, this.imie, this.urodzinki);
    }

    public boolean equals(Person a) {
        Person b = new Person(ID, imie, urodzinki);
        if(a.ID == b.ID){
            if(a.imie == b.imie){
                if(a.urodzinki == b.urodzinki){
                    if(a.getAddresses().equals(b.getAddresses())){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "("+ID+", "+imie+", "+urodzinki+")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, imie, urodzinki, addresses);
    }
}

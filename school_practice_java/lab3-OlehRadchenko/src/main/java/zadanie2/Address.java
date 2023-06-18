package zadanie2;

import java.util.ArrayList;
import java.util.Objects;

public class Address {
    private int ID;
    private String city, postalCode;
    ArrayList<String> addressLines = new ArrayList<>();

    public Address(int ID, String city, String postalCode) {
        this.ID = ID;
        this.city = city;
        this.postalCode = postalCode;
    }

    public ArrayList<String> getAddressLines() {
        return addressLines;
    }

    @Override
    public String toString() {
        String wynik = "("+ID+", "+city+", "+postalCode+", {";
        for(int i=0; i<addressLines.size(); i++){
            if(i==addressLines.size()-1){
                wynik+=" "+addressLines.get(i);
            }else{
                wynik+=" "+addressLines.get(i)+",";
            }
        }
        wynik+=" })";
        return wynik;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, city, postalCode, addressLines);
    }
}

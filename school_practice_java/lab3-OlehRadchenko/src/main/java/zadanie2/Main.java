package zadanie2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {

    public static void main(String[] args){
         Person jan = new Person(1, "jan", LocalDate.of(1990,01,01));

         Person jan_kopia = jan.copy();

         if(!jan.equals(jan_kopia) && jan!=jan_kopia){
             System.out.println("Kopie obiektu powinny być sobie równe. Powinny to być różne referencje."+"\n"+jan+"\n"+jan_kopia);
             System.out.println("Należy nadpisać metodę 'equals' odziedziczoną po klasie 'Object'");
             return;
         }


         Person zdzislaw = jan.copy();
         zdzislaw.setName("zdzislaw");
         zdzislaw.setId(2);
         zdzislaw.setDateOfBirth(jan.getDateOfBirth().plusMonths(2));

         if(zdzislaw.equals(jan)){
             System.out.println("obiekty NIE powinny być sobie równe");
             System.out.println("Należy nadpisać metodę 'equals' odziedziczoną po klasie 'Object', " +
                     "tak aby jakakolwiek różnica w polach obiektów powodowała zwrot 'false'");
             return;
         }

         Address adresJana = new Address(1, "Gdansk", "80-001");
         adresJana.getAddressLines().add("Brzegi 55");
         Address adresKopiiJana = new Address(1, "Gdynia", "80-002");
         adresKopiiJana.getAddressLines().add("Brzegi 55");

         jan.getAddresses().add(adresJana);
         jan_kopia.getAddresses().add(adresKopiiJana);

         if(jan.equals(jan_kopia)){
             System.out.println("jan i jego kopia mają różne adresy ! - metoda 'equals' powinna to uwzględniać");
             return;
         }

         adresJana.getAddressLines().add("dziekanat szkoly");

         System.out.println(jan);
         System.out.println(adresJana);

         HashMap<Person, ArrayList<Address>> addressesByPerson = new HashMap<>();


         addressesByPerson.put(jan, jan.getAddresses());
         addressesByPerson.put(jan_kopia, jan_kopia.getAddresses());
         addressesByPerson.put(zdzislaw, jan.getAddresses());

         Person drugaKopiaJana = jan.copy();

         addressesByPerson.put(drugaKopiaJana, drugaKopiaJana.getAddresses());

        /**
         * NIE chcę aby obiekt, który jest identyczny jak jakiś wcześniej dodany element
         * był dodany w nowe miejsce HashMapy.
         * W tym celu należy nadpisać metodę 'hashCode' dziedziczoną po klasie 'Object'
         * wskazówka - można wykorzystać metodę 'toString' napisaną wcześniej
         */
         if(addressesByPerson.keySet().size()>3){
             System.out.println("druga kopia jana powinna wejść na miejsce jana, więc rozmiar kolekcji nie powinien być większy od 3 ");
             System.out.println("w tym celu nalezy nadpisać metodę 'hashCode' odziedziczoną z klasy 'Object'");
         return;
         }
//
//         Person trzeciaKopiaJana = jan.copy();
//         trzeciaKopiaJana.getAddresses().add(new Address(2, "Sopot", "80-003"));
//         addressesByPerson.put(trzeciaKopiaJana, trzeciaKopiaJana.getAddresses());

        /**
         * koelejny obiekt dodawany do hasmapy jest już inny (ma inny adres),
         * więc powinna się dla niego utworzyć nowa pozycja w HashMapie
         */
//         if(addressesByPerson.keySet().size()!=4){
//             System.out.println("dodanie adresu do trzeciej kopii jana powinno zmienić wynik metody 'hashCode' " +
//                     "- stąd nowy element powinien móc być dodany do kolekcji");
//             return;
//         }

        //System.out.println("wszystko dziala");

    }

}

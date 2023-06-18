import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class kwiaty {
    public static Date dodaj_dni(Date data, int liczba_dni){
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        c.add(Calendar.DATE, liczba_dni);
        data = c.getTime();
        return data;
    }

    public static void main(String[] args) {
        int[] kiedy = {2, 5, 6, 100};
        Date data = new Date();
        Scanner klaw = new Scanner(System.in);
        SimpleDateFormat ladna_data = new SimpleDateFormat("dd-MM-YYYY");//SimpleDateFormat ladna_data = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        int wybor = 0;
        int wybor2 = 0;
        System.out.println("Wybierz kwiata:\n1.Trzykrotka(podlewac co 2 dni)\n2.Strelicja biała(rajscki ptak, podlewac co 5 dni)\n3.Palma Dypsis(podlewac co 6 dni)\n4.Kaktus(podlewac raz na 100 dni)\n5.Kwiat dekoracyjny(nie trzeba podlewac)");
        try{
            wybor = klaw.nextInt();
        }catch (Exception e){
            System.out.println("A teraz zaczynasz od nowa i podajesz liczbe ;>");
            System.exit(66);
        }
        if (wybor<1 || wybor>5) {
            System.out.println("Zaczynasz od nowa i wprowadzasz poprawna wartosc ;<");
            System.exit(66);
        }else {
            System.out.println("Dzisiaj jest: " + ladna_data.format(data) + "\nIle dni temu podlales kwiatka? ");
            try{
                wybor2 = klaw.nextInt();
            }catch (Exception e){
                System.out.println("A teraz zaczynasz od nowa i podajesz liczbe ;>");
                System.exit(66);
            }

            if (wybor == 5){
                System.out.println("Po co go podlewac? -_0");
            }else {
                System.out.println("Kwiatek trzeba podlac: "+ladna_data.format(dodaj_dni(data, kiedy[wybor-1]-wybor2)));
            }
        }
    }
}
package zadanie17;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime()+" - Dzisiaj");
        Date date_w_przyszlosci = new Date();
        date_w_przyszlosci.setTime(date.getTime()+(25*60*1000)+(10*60*60*1000)+(3*24*60*60*1000));
        System.out.println(date_w_przyszlosci.getTime()+" - za 3 dni, 10 godzin i 25 minut");
        System.out.println(date_w_przyszlosci);
    }
}

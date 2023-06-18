package zadanie15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        String pattern = "HH:mm:ss dd.MM.YYYY";
        SimpleDateFormat format= new SimpleDateFormat(pattern);

        System.out.println(format.format(date));
    }
}

package zadanie16;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, 12, 26, 23, 59, 59);
        System.out.println(localDateTime2);
        if(!localDateTime.isAfter(localDateTime2)){
            System.out.println("Ta druga data jest z przyszlosci");
        }else{
            System.out.println("Ta druga data jest z przeszlosci");
        }
    }
}

package zadanie18TEST;

import java.time.LocalDate;

public class Main { //TYLKO WSPOMAGAWCZY PROGRAM
    public static void main(String[] args) {
        String pesel = "94011341966";
        String pesel_bez = "";
        for(int i=0; i<pesel.length()-1; i++){
            pesel_bez += pesel.charAt(i);
        }
        char[] znaki = new char[pesel_bez.length()];
        int[] znaki_int = new int[pesel_bez.length()];
        int liczba=1;
        for(int i=0; i<pesel_bez.length(); i++){
            znaki[i] = pesel_bez.charAt(i);
            znaki_int[i] = znaki[i]-'0';
        }
        for(int i=0; i<pesel_bez.length(); i++){
            znaki_int[i] *= liczba;
            if(liczba==9){
                liczba=1;
            }else if(liczba==3){
                liczba+=4;
            }else{
                liczba+=2;
            }
        }
        int suma=0;
        for(int i=0; i<pesel_bez.length(); i++){
            suma+=znaki_int[i]%10;

        }
        if(10-suma%10 == pesel.charAt(pesel.length()-1)-'0'){
            System.out.println("Jest prawdziwy");
        }else{
            System.out.println("Nie jest prawdziwy");
        }

        LocalDate dateOfBirth;
        int PESEL[] = new int[11];
        for(int i=0; i<11; i++){
            PESEL[i] = pesel.charAt(i)-'0';
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
        System.out.println(dateOfBirth);
    }
}

package zadanie18;

public class PeselValidator {
    public static boolean isValid(String pesel){
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
        if((10-suma%10) == pesel.charAt(pesel.length()-1)-'0'){
            return true;
        }else{
            return false;
        }
    }
}

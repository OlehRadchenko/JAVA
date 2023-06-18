package zadanie9;

public class Main {
    public static void main(String[] args) {
        String slowo = "programowanie";
        char[] znaki = new char[slowo.length()];
        for(int i=0; i<slowo.length(); i++){
            znaki[i] = slowo.charAt(i);
        }
        System.out.println("a)");
        for (int i=0; i<slowo.length(); i++){
            if(i==0){
                System.out.print(Character.toUpperCase(znaki[i]));
            }else{
                System.out.print(znaki[i]);
            }
        }
        System.out.println("\n\nb)\n"+slowo.toUpperCase());
    }
}
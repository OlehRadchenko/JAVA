package zadanie8;

public class Main {
    public static void main(String[] args) {
        String slowo = "Informatyka";
        char[] znaki = new char[slowo.length()];
        for(int i=0; i<slowo.length(); i++){
            znaki[i] = slowo.charAt(i);
        }
        System.out.println("a)");
        for (int i=0; i<slowo.length(); i++){
            System.out.println(znaki[i]);
        }
        System.out.println("\nb)");
        for (int i=0; i<slowo.length(); i++){
            System.out.print(znaki[i]+"\t");
        }
    }
}
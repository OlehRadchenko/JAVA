package zadanie13;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int min, bufor;
            int[] tab = new int[8];
            for(int i=0; i<8; i++){
                System.out.print("Podaj element tablicy: ["+i+"] = ");
                tab[i] = scanner.nextInt();
            }

            for (int i = 0; i < 7; i++) {
                    min = i;
                    for (int j=i; j < 9; j++) {
                        if (j < 8) {
                            if (tab[j] < tab[min]) {
                                min = j;
                            }
                        } else {
                            bufor = tab[min];
                            tab[min] = tab[i];
                            tab[i] = bufor;
                        }
                    }
            }
            System.out.println("Tablica po sortowaniu:");
            for(int i=0; i<8; i++){
                System.out.print(tab[i]+"\t");
            }
        }catch(Exception e){
            System.out.println("Wprowadz prawidlowa liczbe!");
            System.exit(666);
        }
    }
}

package zadanie2;

public class Main {
    public static void main(String[] args) {
        MyWater woda = new MyWater();
        woda.addLarge(2); //JAK W PRZYKŁADZIE
        woda.addMedium(1);
        woda.addSmall(3);
        woda.wypisz();

        System.out.println("Tyle nie wystarczy\nDodajmy jeszcze butelek!!!");
        woda.addLarge(3); //COŚ DODATKOWEGO
        woda.addMedium(8);
        woda.addSmall(1);
        woda.wypisz();
    }
}

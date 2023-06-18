package zadanie2;

public class MyWater {
    private float ilosc_wody=0;
    private int ilosc_duzych=0;
    private int ilosc_srednich=0;
    private int ilosc_malych=0;
    private int pojemnosc_duzej = 2;
    private int pojemnosc_sredniej = 1;
    private double pojemnosc_malej = 0.5;


    public void addLarge(int l){
        this.ilosc_wody+=l*this.pojemnosc_duzej;
        this.ilosc_duzych+=l;
    }
    public void addMedium(int l){
        this.ilosc_wody+=l*this.pojemnosc_sredniej;
        this.ilosc_srednich+=l;
    }
    public void addSmall(int l){
        this.ilosc_wody+=l*this.pojemnosc_malej;
        this.ilosc_malych+=l;
    }
    public void wypisz(){
        System.out.println("Mam teraz: "+ilosc_wody+" litrow wody\nduzych butelek: "+ilosc_duzych+"\nsrednich butelek: "+ilosc_srednich+"\nmalych butelek: "+ilosc_malych);
    }
}

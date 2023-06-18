package zadanie7;

public class Main {
    public static void main(String[] args) {
        Wallet portfel_pracownika = new Wallet();
        for(int miesiac = 1; miesiac<=6; miesiac++){
            portfel_pracownika.addMoney(5000);
            portfel_pracownika.removeMoney(2000);
            portfel_pracownika.removeMoney(1000);
        }
        System.out.println("Podsumowanie portfela po pol roku pracy.\nAktualnie posiadasz: "+portfel_pracownika.getAmount()+" hajsu");
    }
}

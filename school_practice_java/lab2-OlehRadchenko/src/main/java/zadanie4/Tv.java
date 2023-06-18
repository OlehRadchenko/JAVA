package zadanie4;

public class Tv {
    private String prodeucent;
    private String model;
    private int rok_produkcji;
    private String stan_użycia;
    private boolean czy_dziala;
    private double cena;

    public void setProdeucent(String prodeucent) {
        this.prodeucent = prodeucent;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public void setStan_użycia(String stan_użycia) {
        this.stan_użycia = stan_użycia;
    }

    public void setCzy_dziala(boolean czy_dziala) {
        this.czy_dziala = czy_dziala;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getProdeucent() {
        return prodeucent;
    }

    public String getModel() {
        return model;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public String getStan_użycia() {
        return stan_użycia;
    }

    public boolean isCzy_dziala() {
        return czy_dziala;
    }

    public double getCena() {
        return cena;
    }

    public void printBasicData(){
        System.out.println("Producent: "+this.prodeucent+"\nModel: "+this.model+"\nWyprodukowany w: "+this.rok_produkcji);
    }
}

package zadanie3;

public class Box {
    private float wysokosc = 0;
    private float szerokosc = 0;

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }
    public float getWysokosc() {
        return wysokosc;
    }

    public void setSzerokosc(float szerokosc) {
        this.szerokosc = szerokosc;
    }
    public float getSzerokosc() {
        return szerokosc;
    }

    public Box joinDiagonal(Box a, Box b){
        Box wynik = new Box();
        wynik.setSzerokosc(a.getSzerokosc()+b.getSzerokosc());
        wynik.setWysokosc(a.getWysokosc()+b.getWysokosc());
        return wynik;
    }
    public Box joinHorizontal(Box a, Box b){
        Box wynik = new Box();
        wynik.setSzerokosc(a.getSzerokosc()+b.getSzerokosc());
        if(a.getWysokosc()>b.getWysokosc()){
            wynik.setWysokosc(a.getWysokosc());
            return wynik;
        }else {
            wynik.setWysokosc(b.getWysokosc());
            return wynik;
        }
    }
    public Box joinVertical(Box a, Box b){
        Box wynik = new Box();
        wynik.setWysokosc(a.getWysokosc()+b.getWysokosc());
        if(a.getSzerokosc()>b.getSzerokosc()){
            wynik.setSzerokosc(a.getSzerokosc());
            return wynik;
        }else {
            wynik.setSzerokosc(b.getSzerokosc());
            return wynik;
        }
    }
}

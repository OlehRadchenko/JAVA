package zadanie6;

public class Student {
    private String imie;
    private String nazwisko;
    private String miasto;
    private int wiek;

    public Student(String imie, String nazwisko, String miasto, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
    }

    public Student() {
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.miasto = "Gdzies";
        this.wiek = 2;
    }

    public void printBasicData(){
        System.out.println(this.imie+"/\t"+this.nazwisko+"/\t"+this.miasto+"/\t"+this.wiek);
    }
}

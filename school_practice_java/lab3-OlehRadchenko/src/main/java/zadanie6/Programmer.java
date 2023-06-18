package zadanie6;

public class Programmer extends Employee{
    private String languages;
    public Programmer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jezyki programowania: "+languages);
    }
}

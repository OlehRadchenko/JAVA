package zadanie6;

public class Administrator extends Employee{
    private String certificates;

    public Administrator(String name, String surname, String certificates) {
        super(name, surname);
        this.certificates = certificates;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Certyfikaty: "+certificates);
    }
}

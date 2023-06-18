package zadanie6;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ktos", "KtosKtos");
        Administrator administrator = new Administrator("Ktos2", "KtosKtos2", "Najlepsze");
        Programmer programmer = new Programmer("Ktos2", "KtosKtos2", "Najlepsze jezyki swiata(VBS, HTML)");
        employee.printInfo();
        administrator.printInfo();
        programmer.printInfo();
    }
}

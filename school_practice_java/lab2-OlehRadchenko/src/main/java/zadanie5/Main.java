package zadanie5;

public class Main {
    public static void main(String[] args) {
        Student uczen1 = new Student();
        Student uczen2 = new Student("Oleh", "Radchenko", "Gdansk", 17);

        System.out.println("Uczen 1:");
        uczen1.printBasicData();
        System.out.println("\nUczen 2:");
        uczen2.printBasicData();
    }
}

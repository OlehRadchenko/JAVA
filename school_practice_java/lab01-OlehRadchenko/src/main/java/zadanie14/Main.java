package zadanie14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Podaj liczbe a: ");
            float a = scanner.nextFloat();
            System.out.print("Podaj liczbe b: ");
            float b = scanner.nextFloat();
            boolean czy = true;
            while (czy) {
                System.out.println("Co chcesz zrobić z tymi liczbami? \n1-dodac \n2-odjac\n3-pomnozyc\n4-podzielic\n5-podzielic z wyprowadzeniem reszty");
                int wybor = scanner.nextInt();
                if(wybor>0 && wybor<6){
                    czy=false;
                }
                switch(wybor){
                    case 1:
                        suma(a,b);
                        break;
                    case 2:
                        roznica(a,b);
                        break;
                    case 3:
                        iloczyn(a,b);
                        break;
                    case 4:
                        iloraz(a,b);
                        break;
                    case 5:
                        iloraz_z_reszta(a,b);
                        break;
                    default:
                        czy = true;
                        break;
                }
            }


        }catch(Exception e){
            System.out.println("Wprowadz prawidlowa liczbe!");
            System.exit(666);
        }
    }
    public static void suma(float a, float b){
        float wynik = a+b;
        System.out.println(a+" + "+b+" = "+wynik);
    }
    public static void roznica(float a, float b){
        float wynik = a-b;
        System.out.println(a+" - "+b+" = "+wynik);
    }
    public static void iloczyn(float a, float b){
        float wynik = a*b;
        System.out.println(a+" * "+b+" = "+wynik);
    }
    public static void iloraz(float a, float b){
        float wynik = a/b;
        System.out.println(a+" / "+b+" = "+wynik);
    }
    public static void iloraz_z_reszta(float a, float b){
        float reszta=a%b;
        float wynik = (a-reszta)/b;
        System.out.println(a+" / "+b+" z reszta = "+wynik+" + reszta: "+reszta);
    }
}

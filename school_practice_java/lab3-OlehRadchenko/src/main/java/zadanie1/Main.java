package zadanie1;

public class Main{

    public static void main(String[] args){
        Polynomial w1 = new Polynomial(new int[]{1, 2, 1});
        w1.setCoeficients(new int[] {2,3});
        int[] w1_coef = w1.getCoeficients();

        if(w1_coef[0]!=2 || w1_coef[1]!=3){
           System.out.println("Gettery lub settery nie działają poprawnie");
            return;
        }

        int a = w1.coeficientAt(1);
        int b = w1.coeficientAt(0);

        if(a!=3 ||b!=2){
            System.out.println("Wybieranie konkretnych współczynników nie działa poprawnie");
            return;
        }

        Polynomial w2 = new Polynomial(new int []{2,3,4});
        Polynomial w3 = w1.add(w2);

        if(w3.coeficientAt(0)!=4 || w3.coeficientAt(1) != 6 || w3.coeficientAt(2) !=4){
            System.out.println("Dodawanie wielomianów nie działa poprawnie");
            return;
        }

        if(!w3.toString().equals("4x^2+6x+4")){
            System.out.println("Nie wyświetli dobrze wilomianu na konsoli "+ w3.toString());
            return;
        }

        if(!w3.equals(new Polynomial(new int[] {4,6,4}))){
            System.out.println("Porównywanie wielomianów nie działa poprawnie");
            return;
        }


        /**
         * Dodaj nową klasę PolynomialHelper, z metodą o nazwie derrivative,
         * która wyliczy pochdną wielomianu
         */

        Polynomial w3_pochodna = PolynomialHelper.derrivative(w3); //NIE MIELIŚMY POCHODNEJ I NIE MA NA NECIE WZROKÓW DO TEGO ;c(COŚ JEDNAK ZADZIAŁAŁO ALE IDK CZY DOBRZE)
        if(!w3_pochodna.equals(new Polynomial(new int[] {6, 8}))){
            System.out.println("Pochodna wielomianu nie została poprawnie wyliczona");
            return;
        }
        //System.out.println(w3_pochodna.toString());

        System.out.println("koniec");
    }
}
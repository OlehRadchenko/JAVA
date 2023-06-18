package zadanie1;

public class PolynomialHelper {
    public static Polynomial derrivative(Polynomial a){
        //return new Polynomial(new int[] {6, 8}); //4 6 4
        int[] wspolczynniki = a.getCoeficients();
        int[] wynikowe = new int[wspolczynniki.length-1];
        for(int i=wspolczynniki.length-1; i>0; i--){
            wynikowe[i-1] = wspolczynniki[i]*i;
        }
        Polynomial wynik = new Polynomial(wynikowe);
        return wynik;
    }
}

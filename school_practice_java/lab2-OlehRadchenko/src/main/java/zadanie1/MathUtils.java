package zadanie1;


public class MathUtils {

    /*
        Funkcja oblicza n!
     */
    public static int factorial(int n){
        int silnia=1;
        if(n==0){
            silnia=1;
        }else if(n>0){
            for(int i=n; i>0; i--){
                silnia*=i;
            }
        }
        return silnia;
    }

    /*
        Funkcja oblicza n! (zastosować rekurencję)
     */
    public static int factorialRecursive(int n){
        if(n<1){
            return 1;
        }else{
            return n*MathUtils.factorialRecursive(n-1);
        }
    }

    /*
        Funkcja oblicza przyblożoną całkę oznaczoną od a do b dla wielomiany o podanych w tabeli współczunnikach
        (całka oznaczona to pole powierzchni pod wykresem wielomianu na przedziale [a,b])
     */
    public static double integralOfPolynomial(double[] coefficients,double a, double b){
        return 0;
    }

    /*
        Funkcja przedstawia nieskracalny ułamek w postaci a/b
        np. dla 9/12 zwróci "3/4"
                15/5 zwróci "3"
     */
    public static String simplifyFractionInString(int meter, int denominator){
        int a = meter;
        int b = denominator;
        if(a>b){
            for(int i = 2; i<=a; i++){
                if(a%i == 0 && b%i == 0 && b>1){
                    a/=i;
                    b/=i;
                    i=2;
                }
            }
            return a+"/"+b;
        }else if(b>a){
            for(int i = 2; i<=b; i++){
                if(a%i == 0 && b%i == 0 && a>1){
                    a/=i;
                    b/=i;
                    i=2;
                }

            }
            return a+"/"+b;
        }else{
            return "1";
        }

    }

}
package zadanie1;

public class Polynomial {
    private int[] coeficients;
    public Polynomial(int[] a){
        coeficients = a;
    }
    public int[] getCoeficients() {
        return coeficients;
    }
    public void setCoeficients(int[] wspolczynniki) {
        coeficients = wspolczynniki;
    }
    public int coeficientAt(int i){
        if(coeficients.length>i) {
            return coeficients[i];
        }else{
            return 0;
        }
    }

    public Polynomial add(Polynomial a){
        Polynomial cos_nie_tak = new Polynomial(new int[]{0,0,0});
        Polynomial b = new Polynomial(coeficients);

        if(b.getCoeficients().length>a.getCoeficients().length){
            int[] wyniki = new int[b.getCoeficients().length];
            for(int i=0; i<b.getCoeficients().length; i++){
                wyniki[i] = a.coeficientAt(i) + b.coeficientAt(i);
                if(i==b.getCoeficients().length-1){
                    Polynomial wynik = new Polynomial(wyniki);
                    return wynik;
                }
            }
        }else{
            int[] wyniki = new int[a.getCoeficients().length];
            for(int i=0; i<a.getCoeficients().length; i++){
                wyniki[i] = a.coeficientAt(i) + b.coeficientAt(i);
                //System.out.println(wyniki[i]);
                if(i==a.getCoeficients().length-1){
                    Polynomial wynik = new Polynomial(wyniki);
                    return wynik;
                }
            }
        }

        return cos_nie_tak;
    }

    public String toString(){
        String wynik = "";
        for(int i=coeficients.length-1; i>=0; i--){
            if(i>1){
                wynik+=coeficientAt(i)+"x^"+i+"+";
            }else if(i==1){
                wynik+=coeficientAt(1)+"x"+"+";
            }else{
                wynik+=coeficientAt(0);
            }
        }
        return wynik;
    }

    public boolean equals(Polynomial a) {
        Polynomial b = new Polynomial(coeficients);
        if(a.getCoeficients().length == b.getCoeficients().length){
            for(int i=0; i<b.getCoeficients().length; i++){
                if(a.coeficientAt(i)==b.coeficientAt(i)){
                    return true;
                }
            }
        }else{
            return false;
        }
        return false;
    }
}

package zadanie10;

public class ProductSorter {
    public Product[] sort(Product[] a){
        double bufor;
        int min;
        for(int i=0; i<a.length-1; i++){
            min = i;
            for (int j=i; j < a.length+1; j++) {
                if (j < a.length) {
                    if (a[j].getPrice() < a[min].getPrice()) {
                        min = j;
                    }
                } else {
                    bufor = a[min].getPrice();
                    a[min].setPrice(a[i].getPrice());
                    a[i].setPrice(bufor);
                }
            }
        }
        return a;
    }

    public Product mostExpensive(Product[] a){
        double max = a[0].getPrice();
        int index=0;
        for(int i=0; i<a.length; i++){
            if(a[i].getPrice()>max){
                max = a[i].getPrice();
                index = i;
            }
        }
        return a[index];
    }

    public Product theCheapest(Product[] a){
        double min = a[0].getPrice();
        int index=0;
        for(int i=0; i<a.length; i++){
            if(a[i].getPrice()<min){
                min = a[i].getPrice();
                index = i;
            }
        }
        return a[index];
    }

    public Product[] theCheapest(Product[] a, int n){
        double bufor;
        int min;
        for(int i=0; i<a.length-1; i++){
            min = i;
            for (int j=i; j < a.length+1; j++) {
                if (j < a.length) {
                    if (a[j].getPrice() < a[min].getPrice()) {
                        min = j;
                    }
                } else {
                    bufor = a[min].getPrice();
                    a[min].setPrice(a[i].getPrice());
                    a[i].setPrice(bufor);
                }
            }
        }
        Product[] wynik = new Product[n];
        for(int i=0; i<n; i++){
            wynik[i] = new Product();
            wynik[i] = a[i];
        }
        return wynik;
    }
}

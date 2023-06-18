package zadanie10;

public class DiscountCalculator {
    private Product[] products;

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public DiscountCalculator(Product[] products) {
        this.products = products;
    }

    public void discountByPercentage(double minimumPrice, double percentage){
        double suma_zamowienia = 0;
        for(int i=0;i<products.length; i++){
            suma_zamowienia+=products[i].getPrice();
        }
        if(suma_zamowienia>minimumPrice){
            double znizka = suma_zamowienia;
            znizka*=percentage;
            suma_zamowienia-=znizka;
            System.out.println("Suma zamowienie ze znizka "+percentage*100+"% to: "+suma_zamowienia+ " zl");
        }else{
            System.out.println("Nie ma wystarczajacej sumy dla znizki wiec placisz: "+suma_zamowienia+" zl");
        }
    }
    public void addFreeCompanyGlass(double minimumPrice){
        double suma_zamowienia = 0;
        for(int i=0;i<products.length; i++){
            suma_zamowienia+=products[i].getPrice();
        }
        if(suma_zamowienia>minimumPrice){
            System.out.println("Brawo, zrobiles duze zakupy suma na ponad "+minimumPrice+" i jako prezent dostaniesz od nas kubek ;3");
        }else{
            System.out.println("Nie dostaniesz kubeczku ;<");
        }
    }
    public void threeForPriceOfTwo(){
        int ile_za_free = (products.length - (products.length%3))/3;
        ProductSorter sorter = new ProductSorter();
        if(ile_za_free>1){
            Product[] za_free;
            za_free = sorter.theCheapest(products, ile_za_free);
            System.out.println("JOOOOO. Kupiles tak duzo u nas (())__(())? Dostaniesz "+ile_za_free+" sztuki towaru za darmo i to jest: ");
            for(int i=0; i<za_free.length; i++){
                System.out.println(za_free[i].getName()+"za cale "+za_free[i].getPrice()+" zl");
            }
        }else if(ile_za_free==1){
            Product za_free;
            za_free = sorter.theCheapest(products);
            System.out.println("Dostaniesz 1 towar za darmo i to jest: "+za_free.getName()+" za cale "+za_free.getPrice()+" zl");
        }else{
            System.out.println("Nie dostaniesz za darmo, bo za malo kupiles ;>");
        }
    }
}

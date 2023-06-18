package zadanie10;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        ProductSorter sorter = new ProductSorter();
        for(int i=0; i<10; i++){
            products[i] = new Product();
            products[i].setName("Towar "+i);
            products[i].setPrice(Math.floor(Math.random()*100));
        }
        System.out.println("Tabela towarow: ");
        for(int i=0; i<10; i++){
            System.out.println(products[i].getName()+" : "+products[i].getPrice()+" zl");
        }

        System.out.println("\nTabela towarow(posortowane ;3): ");
        Product[] posortowane;
        posortowane = sorter.sort(products);
        for(int i=0; i<10; i++){
            System.out.println(posortowane[i].getName()+" : "+posortowane[i].getPrice()+" zl");
        }

        Product expensive ;
        expensive = sorter.mostExpensive(products);
        System.out.println("\nNajdrozszy towar: \n"+expensive.getName()+" : "+expensive.getPrice());

        Product cheap;
        cheap = sorter.theCheapest(products);
        System.out.println("\nNajtanszy towar: \n"+cheap.getName()+" : "+cheap.getPrice());

        System.out.println("\n3 najtansze towary: ");
        Product[] TopCheap3;
        TopCheap3 = sorter.theCheapest(products, 3);
        for(int i=0; i<3; i++){
            System.out.println(TopCheap3[i].getName()+" : "+TopCheap3[i].getPrice()+" zl");
        }

        System.out.println("\n\n\n");
        DiscountCalculator calculator = new DiscountCalculator(products);
        System.out.println("Kubek za przekroczenie 200zl sumy zakupu");
        calculator.addFreeCompanyGlass(200);
        System.out.println("\nZnizka(5%) za przekroczenie 800zl sumy zakupu");
        calculator.discountByPercentage(800, 0.05);
        System.out.println("\n3 w cenie 2");
        calculator.threeForPriceOfTwo();
    }
}

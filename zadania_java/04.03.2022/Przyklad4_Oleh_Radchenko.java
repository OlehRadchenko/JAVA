class Produkt
    {
        static int liczbaproduktow=0;
        // zmienna statyczna nalezy doklasy nie obiektu
        int numerklienta =0;
        Produkt (String towar) //konstuktor w klasie produkt
        {
            System.out.println(" Obsluga wprowadza do sprzedazy: " +towar +" z eksportu" );
        }
    }// koniec klasy Produkt
    public class Przyklad4_Oleh_Radchenko
    {
        public static void main (String args[])
        {
// powolanie trzech obiektów woda, chleb, maslo
// z przekazaniem parametru do konstruktora
            Produkt woda = new Produkt(" woda" );
            Produkt chleb = new Produkt(" chleb" );
            Produkt maslo = new Produkt(" maslo" );
            woda.numerklienta=1 ;
            woda.liczbaproduktow++;
            System.out.println(" klient : " +woda.numerklienta);
            System.out.println(" Liczba sprzedana wody: " +woda.liczbaproduktow);
            System.out.println(" Liczba sprzedana chleba: " +chleb.liczbaproduktow);
            System.out.println(" Liczba sprzedana maslo: " +maslo.liczbaproduktow);
            chleb.numerklienta=2;
            chleb.liczbaproduktow++;
            System.out.println(" klient : " +chleb.numerklienta);
            System.out.println(" Liczba sprzedana wody: " +woda.liczbaproduktow);
            System.out.println(" Liczba sprzedana chleba: " +chleb.liczbaproduktow);
            System.out.println(" Liczba sprzedana maslo: " +maslo.liczbaproduktow);
            maslo.numerklienta=3;
            maslo.liczbaproduktow++;
            System.out.println(" klient : " +maslo.numerklienta);
            System.out.println(" Liczba sprzedana wody: " +woda.liczbaproduktow);
            System.out.println(" Liczba sprzedana chleba: " +chleb.liczbaproduktow);
            System.out.println(" Liczba sprzedana maslo " +maslo.liczbaproduktow);
        }
}

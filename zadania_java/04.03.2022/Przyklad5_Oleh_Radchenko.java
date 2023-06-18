class Okrag
{
    static int liczbaokregow=0; //pole
    Okrag (String figura) //konstruktor
    {
        System.out.println("Utworzony okrag " +figura );
    }
    void Obwod (double r) //metoda1
    {
        final double PI=3.14159; //deklaracja stałej
        double obw=2*PI*r;
        System.out.println("obw=" +obw+" cm");
    }
    void Pole (double r) //metoda2
    {
        final double PI=3.14159;
        double pol=PI*r*r;
        System.out.println("pol=" +pol+" cm^2");
    }
}

public class Przyklad5_Oleh_Radchenko {
    public static void main (String args[])
    {
        Okrag okrag1 = new Okrag(" okrag pierwszy" ); //insatlacja nowego obiektu okrag1
        okrag1.liczbaokregow++; //zwiekszenie zawartosci pola
        System.out.println("to jest okrag= "+okrag1.liczbaokregow);
        okrag1.Obwod(3); //wywołanie motedy
        okrag1.Pole(3);
        Okrag okrag2 = new Okrag(" okrag drugi" ); //insatlacja nowego obiektu okrag2
        okrag2.liczbaokregow++;
        System.out.println("to jest okrag= "+okrag2.liczbaokregow);
        okrag2.Obwod(4);
        okrag2.Pole(4);
    }
}

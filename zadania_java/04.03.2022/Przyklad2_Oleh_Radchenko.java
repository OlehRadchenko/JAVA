public class Przyklad2_Oleh_Radchenko
{
    public static void main(String args[])
    {
        Licznik.przelicz ();
        System.out.println("licznik="+Licznik.licznik);
        Licznik.przelicz ();
        System.out.println("licznik="+Licznik.licznik);
    }
}
class Licznik
{
    public static int licznik=0;
    public static void przelicz()
    {
        licznik++;
    }
}
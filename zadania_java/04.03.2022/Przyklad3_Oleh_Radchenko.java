public class Przyklad3_Oleh_Radchenko
{
    public static void main(String args[])
    {
        Nazwisko naz=new Nazwisko("Kowalski");

        naz.wyswietl_nazwisko();

    }
}
class Nazwisko
{
    String nazwisko_1;
    public Nazwisko(String nazwisko_2)
    {
        nazwisko_1=nazwisko_2;
    }
    public void wyswietl_nazwisko()
    {
        System.out.println(nazwisko_1);
    }
}
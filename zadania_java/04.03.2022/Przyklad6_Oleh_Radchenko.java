class Punkt
{
    int x;
    int y;
    Punkt()
    {
        x = 1;
        y = 1;
    }
    public int pobierzX(){
        return x;
    }
    public int pobierzY(){
        return y;
    }
}

public class Przyklad6_Oleh_Radchenko {
    public static void main (String args[])
    {
        Punkt punkt = new Punkt();
        punkt.x = 100;
        punkt.y = 100;
        System.out.println("współrzędna x = " + punkt.pobierzX());
        System.out.println("współrzędna y = " + punkt.pobierzY());
    }
}

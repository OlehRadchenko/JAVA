package zadanie12;

public class Angle {
    private double x;

    public Angle(double x) {
        this.x = x;
    }

    public double sinus(){
        return Math.sin(x);
    }
    public double cosinus(){
        return Math.cos(x);
    }
    public double tangens(){
        return sinus()/cosinus();
    }
    public double cotangens(){
        return 1/tangens();
    }
    public double secans(){
        return 1/cosinus();
    }
    public double cosecans(){
        return 1/sinus();
    }

    public static double radian(double x){
        return Math.toRadians(x);
    }
    public static double degree(double x){
        return Math.toDegrees(x);
    }
}

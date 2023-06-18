package zadanie10;

public class Main {
    public static void main(String[] args){
        try{ //CZESC 1
            int a = 10/0;
        }catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Wartosc ustawilem na 0, bo nie mozna dzielic przez 0");
            int a = 0;
        }finally {
            System.out.println("I pamietaj ze nie mozesz dzielic przez 0.(ten blok jest wykonywany zawsze (i przy wylapaniu bledu i bez wylapania bledu))");
        }

        try{ //CZESC 2
            miesiac(0);
        }catch (TestException e){
            e.printStackTrace();
        }
    }
    public static void miesiac(int a) throws TestException{
        if(a<1 || a>12)
            throw new TestException();
    }
}

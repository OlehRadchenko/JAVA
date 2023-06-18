import java.util.Random;
import java.util.Scanner;

public class przyklad1 {


    public static void main(String[] args) {
        Random losowa = new Random();
        Scanner klawiatura = new Scanner(System.in);
        /**
         @version alpha
         @author Oleh Radchenko 2-P
         Ten program sprawdza wiedze na temat funkcji kwadratowych
         @param a jest to zmienna a w funkcji f(x)=ax^2+bx+c w int
         @param b jest to zmienna b w funkcji f(x)=ax^2+bx+c w int
         @param c jest to zmienna c w funkcji f(x)=ax^2+bx+c w int
         @param wybor jest to zmienna odpowiedzi uzytkownika w int
         @param miejsca_zerowe jest to ilosc miejsc zerowych (0-2)

         @param miejsce_zer jest to miejsce zerowe w formie float
         @param wybor2 jest to zmienna odpowiedzi uzytkownika w float
         @param a_ jest to zmienna a, ale w float(dla wyliczenia delty)
         @param b_ jest to zmienna c, ale w float(dla wyliczenia delty)
         @param c_ jest to zmienna b, ale w float(dla wyliczenia delty)
         @param delta jest to delta funkcji kwadratowej
         @param wybor3 jest to kolejny wybor uzytkownika

         @param pierw_delta jest to pierwiastek z delty(dla obliczen miejsc zerowych)
         @param x1 jest to miejsce zerowe funkcji z delta większa od 0
         @param x2 jest to miejsce zerowe funkcji z delta większa od 0
         @param a_2 jest to zmienna a, ale w double(dla wyliczenia miejsc zerowych)
         @param b_2 jest to zmienna c, ale w double(dla wyliczenia miejsc zerowych)
         @param c_2 jest to zmienna b, ale w double(dla wyliczenia miejsc zerowych)
         @param b_odwr jest to odwrotnosc od b
         @param x0 jest to miejsce zerowe dla funkcji kwadratowej z delta = 0
         */
        int a, b, c, wybor, miejsca_zerowe;
        float miejsce_zer, wybor2, a_, b_, c_, delta,wybor3;
        double pierw_delta, x1, x2, a_2, b_2, b_odwr, x0;
        System.out.println("Losuję wzór funkcji kwadratowej...");
        a = losowa.nextInt(20)-10;
        b = losowa.nextInt(20)-10;
        c = losowa.nextInt(20)-10;
        a=0;
        b=-2;
        c=1;
        if(a==0 && b!=0 && c!=0){
            System.out.println("Wzór funkcji f(x) = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("Czy to jest funkcja kwadratowa\n1.Tak\n2.Nie");
            wybor = klawiatura.nextInt();
            switch(wybor){
                case 1:
                    System.out.print("Nie, to jest funkcja liniowa\nA teraz wskaż miejsce zerowe: ");
                    b_ = b;
                    c_ = c;
                    miejsce_zer = -c_/b_;
                    System.out.println(miejsce_zer);
                    wybor2 = klawiatura.nextFloat();
                    if(wybor2 == miejsce_zer){
                        System.out.println("Brawo, dobrze wyliczyłeś");
                    }else{
                        System.out.println("Nie, źle wyliczyłeś\n Co chcesz dalej?\n1.Wyliczyć od nowa i jeszcze raz spróbować\n2.Pokażę odpowiedź i na tym skończymy\n3.Pokażę pełne rozwiązanie");
                        wybor = klawiatura.nextInt();
                        switch(wybor) {
                            case 1:
                                System.out.println("Wskaż miejsce zerowe:");
                                wybor2 = klawiatura.nextFloat();
                                if (wybor2 == miejsce_zer) {
                                    System.out.println("Brawo, dobrze wyliczyłeś");
                                } else {
                                    System.out.println("Nadal źle ;c");
                                }
                                break;
                            case 2:
                                System.out.println("Miejsce zerowe to : " + miejsce_zer);
                                break;
                            case 3:
                                System.out.println(b + "x + " + c + " = 0\nx = -" + c + "/" + b + "\nx = " + miejsce_zer);
                                break;
                            default:
                                System.out.println("Nie poprawna wartość ;c");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Tak, to nie jest funkcja kwadratowa(to jest funkcja liniowa)\nA teraz wskaż miejsce zerowe: ");
                    b_ = b;
                    c_ = c;
                    miejsce_zer = -c_/b_;
                    System.out.println(miejsce_zer);
                    wybor2 = klawiatura.nextFloat();
                    if(wybor2 == miejsce_zer){
                        System.out.println("Brawo, dobrze wyliczyłeś");
                    }else{
                        System.out.println("Nie, źle wyliczyłeś\n Co chcesz dalej?\n1.Wyliczyć od nowa i jeszcze raz spróbować\n2.Pokażę odpowiedź i na tym skończymy\n3.Pokażę pełne rozwiązanie");
                        wybor = klawiatura.nextInt();
                        switch(wybor){
                            case 1:
                                System.out.println("Wskaż miejsce zerowe:");
                                wybor2 = klawiatura.nextFloat();
                                if(wybor2 == miejsce_zer){
                                    System.out.println("Brawo, dobrze wyliczyłeś");
                                }else{
                                    System.out.println("Nadal źle ;c");
                                }
                                break;
                            case 2:
                                System.out.println("Miejsce zerowe to : "+miejsce_zer);
                                break;
                            case 3:
                                System.out.println(b+"x + "+c+" = 0\nx = -"+c+"/"+b+"\nx = "+miejsce_zer);
                                break;
                            default:
                                System.out.println("Nie poprawna wartość ;c");
                        }
                    }
                    break;
                default:
                    System.out.println("Nie poprawna wartość ;c");
            }
        }
        else{
            System.out.println("Wzór funkcji f(x) = "+a+"x^2 + "+b+"x + "+c);
            delta = b*b - 4*a*c;
            b_ = b;
            c_ = c;
            a_ = a;
            pierw_delta = Math.sqrt(delta);
            System.out.println("Ile będzie delta?");
            wybor = klawiatura.nextInt();
            if(wybor == delta){
                System.out.println("Brawo!!! Dobrze wyliczyłeś\nTo ile będzie miejsc zerowych?");
                wybor = klawiatura.nextInt();
                if(delta>0){
                    miejsca_zerowe = 2;
                }else if(delta<0){
                    miejsca_zerowe = 0;
                }else{
                    miejsca_zerowe = 1;
                }
                if(miejsca_zerowe == wybor){
                    System.out.println("Brawo!!! Dobrze wyliczyłeś");
                }else{
                    System.out.println("Nie, poprawna odpowiedź to: "+miejsca_zerowe);
                }
                b_2 = b_;
                b_odwr = b_2 - (2*b_2);
                a_2 = a_;
                if(miejsca_zerowe == 0){
                    System.out.println("Czy możemy wyliczyć postać kanoniczną?\n1.Tak\n2.Nie");
                    wybor= klawiatura.nextInt();
                    if(wybor == 1){
                        System.out.println("Powtórz ten temat bo odpowiadasz źle ;c");
                    } else if(wybor == 2){
                        System.out.println("Dobrze!!!");
                    } else if(wybor != 1 && wybor != 2){
                        System.out.println("Nie ładnie tak, teraz nie zdobędziesz wybiku :,<");
                    }

                }else if(miejsca_zerowe == 1){
                    x0 = b_odwr/(2*a_2);
                    System.out.println("To teraz podaj x0");
                    wybor2= klawiatura.nextFloat();
                    if(wybor2 < 1.10*x0 && wybor2 > 0.9*x0){
                        System.out.println("Brawo! Bardzo dobrze znasz ten temat");
                    } else{
                        System.out.println("Źle ;c");
                    }
                }else{
                    System.out.println("To teraz podaj x1 i x2");
                    x1 = (b_odwr-pierw_delta)/(2*a_2);
                    x2 = (b_odwr+pierw_delta)/(2*a_2);
                    System.out.print("x1: ");
                    wybor2= klawiatura.nextFloat();
                    System.out.print("x2: ");
                    wybor3 = klawiatura.nextFloat();
                    if(wybor2 < 1.1*x1 && wybor2 > 0.9*x1 && wybor3 < x2 && wybor3 > 0.9*x1){
                        System.out.println("Brawo! Bardzo dobrze znasz ten temat");
                    } else if(wybor2 < 1.1*x1 && wybor2 > 0.9*x1 && wybor3 != x2){
                        System.out.println("x1 masz dobrze,ale x2 wyliczyłeś źle ;c");
                    } else if(wybor3 < 1.1*x2 && wybor3 > 0.9*x2 && wybor2 != x1){
                        System.out.println("x2 masz dobrze,ale x1 wyliczyłeś źle ;c");
                    } else if(wybor3 != x2 && wybor2 != x1){
                        System.out.println("Wszystko źle ;c");
                    }
                    /*System.out.println(x1+"\n"+x2+"\n"+pierw_delta+"\n"+a_2+"\n"+b_odwr);*/
                }
            }else{
                System.out.println("Nie udało się ;c\nPoprawna odpowiedz to: "+delta+"\nTo ile będzie miejsc zerowych?");
                wybor = klawiatura.nextInt();
                if(delta>0){
                    miejsca_zerowe = 2;
                }else if(delta<0){
                    miejsca_zerowe = 0;
                }else{
                    miejsca_zerowe = 1;
                }
                if(miejsca_zerowe == wybor){
                    System.out.println("Brawo!!! Dobrze wyliczyłeś");
                }else{
                    System.out.println("Nie, poprawna odpowiedź to: "+miejsca_zerowe);
                }
            }
        }

    }
}

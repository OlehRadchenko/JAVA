import javax.swing.*;
import java.net.SocketOption;
import java.util.Scanner;

public class kalendarz {
    public static String tydzien[] =
            {"poniedziałek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela"};

    public static String miesiac[] =
            {"Styczen", "Luty", "Marzec", "Kwiecien", "Maj", "Czerwiec", "Lipiec", "Sierpien", "Wrzesien", "Pazdziernik", "Listopad", "Grudzien"};

    public static int liczbaDni[] =
            {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public static boolean przestepny(int rok) {
        return ((rok % 4 == 0  &&  rok % 100 != 0) || rok % 400 == 0);
    }

    public static int dzienTygodnia(int dzien, int miesiac, int rok) {
        int dzienRoku;
        int yy, c, g;
        int wynik;

        dzienRoku = dzien + liczbaDni[miesiac-1];
        if ((miesiac > 2) && (przestepny(rok) == true))
            dzienRoku++;

        yy = (rok - 1) % 100;
        c = (rok - 1) - yy;
        g = yy + (yy / 4);
        wynik = (((((c / 100) % 4) * 5) + g) % 7);
        wynik += dzienRoku - 1;
        wynik %= 7;

        return wynik;
    }

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int wynik;
        int d, m, r, raz = 0;

        System.out.println("Podaj dla jakiej daty obliczyc dzien tygodnia.");

        System.out.println("Podaj dzien:");
        d = klawiatura.nextInt();
        System.out.println("Podaj miesiac:");
        m = klawiatura.nextInt();
        System.out.println("Podaj rok:");
        r = klawiatura.nextInt();
        if ((d <= 0) || (d > 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) || (d > 30 && (m == 4 || m == 6 || m == 9 || m == 11)) || (d > 29 && m == 2 && przestepny(r) == true) || (d > 28 && m == 2 && przestepny(r) == false) || (m <= 0) || (m > 12) || (r <= 0)) {
            System.out.println("Wprowadziles zle dane");
        } else {
            wynik = dzienTygodnia(d, m, r);
            System.out.println("\t   " + miesiac[m - 1] + " " + r);
            System.out.println("|Pon|Wt|Sr|Czw|Pt|Sob|Nied|");
            int dzien = 0;
            // Jeżeli 1 to poniedziałek:
            if (dzienTygodnia(1, m, r) == 0) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (dzien < 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                            dzien++;
                            if (dzien == d) {
                                System.out.print("*\t");
                            } else {
                                System.out.print(dzien + "\t");
                            }
                        } else if (dzien < 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                            dzien++;
                            if (dzien == d) {
                                System.out.print("*\t");
                            } else {
                                System.out.print(dzien + "\t");
                            }
                        } else if (dzien < 29 && m == 2 && przestepny(r) == true) {
                            dzien++;
                            if (dzien == d) {
                                System.out.print("*\t");
                            } else {
                                System.out.print(dzien + "\t");
                            }
                        } else if (dzien < 28 && m == 2 && przestepny(r) == false) {
                            dzien++;
                            if (dzien == d) {
                                System.out.print("*\t");
                            } else {
                                System.out.print(dzien + "\t");
                            }
                        }
                    }
                    System.out.println("");
                }
            }

            //Jeżeli 1 to wtorek:
            if (dzienTygodnia(1, m, r) == 1) {
                System.out.print("-\t");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (raz < 1) {
                            raz += 1;
                        } else {
                            if (dzien < 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 29 && m == 2 && przestepny(r) == true) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 28 && m == 2 && przestepny(r) == false) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            }
                        }
                    }
                    System.out.println("");
                }
            }


            //Jeżeli 1 to sroda:
            if (dzienTygodnia(1, m, r) == 2) {
                System.out.print("-\t-\t");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (raz < 2) {
                            raz += 1;
                        } else {
                            if (dzien < 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 29 && m == 2 && przestepny(r) == true) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 28 && m == 2 && przestepny(r) == false) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            }
                        }
                    }
                    System.out.println("");
                }
            }


            //Jeżeli 1 to czwartek:
            if (dzienTygodnia(1, m, r) == 3) {
                System.out.print("-\t-\t-\t");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (raz < 3) {
                            raz += 1;
                        } else {
                            if (dzien < 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 29 && m == 2 && przestepny(r) == true) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 28 && m == 2 && przestepny(r) == false) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            }
                        }
                    }
                    System.out.println("");
                }
            }


            //Jeżeli 1 to piatek:
            if (dzienTygodnia(1, m, r) == 4) {
                System.out.print("-\t-\t-\t-\t");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (raz < 4) {
                            raz += 1;
                        } else {
                            if (dzien < 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 29 && m == 2 && przestepny(r) == true) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 28 && m == 2 && przestepny(r) == false) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            }
                        }
                    }
                    System.out.println("");
                }
            }


            //Jeżeli 1 to sobota:
            if (dzienTygodnia(1, m, r) == 5) {
                System.out.print("-\t-\t-\t-\t-\t");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (raz < 5) {
                            raz += 1;
                        } else {
                            if (dzien < 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 29 && m == 2 && przestepny(r) == true) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 28 && m == 2 && przestepny(r) == false) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            }
                        }
                    }
                    System.out.println("");
                }
            }


            //Jeżeli 1 to niedziela:
            if (dzienTygodnia(1, m, r) == 6) {
                System.out.print("-\t-\t-\t-\t-\t-\t");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (raz < 6) {
                            raz += 1;
                        } else {
                            if (dzien < 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 29 && m == 2 && przestepny(r) == true) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            } else if (dzien < 28 && m == 2 && przestepny(r) == false) {
                                dzien++;
                                if (dzien == d) {
                                    System.out.print("*\t");
                                } else {
                                    System.out.print(dzien + "\t");
                                }
                            }
                        }
                    }
                    System.out.println("");
                }
            }

            System.out.println("\n\nDzien tygodnia dla podanej daty to " + tydzien[wynik]);
        }
    }
}
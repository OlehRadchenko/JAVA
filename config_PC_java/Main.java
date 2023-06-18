import java.util.Scanner;
class PC {
    protected float price() {
        return 1300;
    }
    protected String description() {
        return "Twoj komputer to:\n-Dostawa (cena dodatkowa: +50zl)\n-Plyta glowna (cena dodatkowa +550zl)\n-Zasilacz(cena dodatkowa: +700zl)";
    }
}

public class Main {
    public static void main(String[] args) {
        PC PC_podstawowe = new PC();
        Scanner key = new Scanner(System.in);
        int wybor = 0;
        System.out.println("Hej! Slyszalem ze potrzebujesz PC GAMINGOWY 0_0\nPomozemy ci z konfiguracja twojego kompa marzen!\nZacznijmy od tego jaka chcesz karte graficzna:\n1.RTX 2060\n2.RTX 2060 SUPER\n3.RTX 3060\n4.RTX 3060 TI");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC karta = null;
        switch (wybor) {
            case 1:
                karta = new RTX2060(PC_podstawowe);
                break;
            case 2:
                karta = new RTX2060_s(PC_podstawowe);
                break;
            case 3:
                karta = new RTX3060(PC_podstawowe);
                break;
            case 4:
                karta = new RTX3060TI(PC_podstawowe);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println("To teraz trzeba wybrac procesor, nie mamy ich za duzo ale zawsze mozesz wybrac ten ktory ma lepsza nazwe ;)\n1.Ryzen5 5600X\n2.Intel7 9700k");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC procesor = null;
        switch (wybor) {
            case 1:
                procesor = new Ryzen5_5600X(karta);
                break;
            case 2:
                procesor = new Intel7_9700k(karta);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println("Jaki RAM wariacie?\n1.8GB DDR3\n2.8GB DDR4\n3.16GB DDR3\n4.16GB DDR4\n5.32GB DDR3\n6.32GB DDR4");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC RAM = null;
        switch (wybor) {
            case 1:
                RAM = new GB8_DDR3(procesor);
                break;
            case 2:
                RAM = new GB8_DDR4(procesor);
                break;
            case 3:
                RAM = new GB16_DDR3(procesor);
                break;
            case 4:
                RAM = new GB16_DDR4(procesor);
                break;
            case 5:
                RAM = new GB32_DDR3(procesor);
                break;
            case 6:
                RAM = new GB32_DDR4(procesor);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println("No to teraz jedna z glownych rzeczy, jaki chcesz miec dysk SSD?\n1.SSD M2 512GB\n2.SSD M2 1TB\n3.SSD M2 2TB\n4.SSD 512GB\n5.SSD 1TB\n6.SSD 2TB");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC SSD = null;
        switch (wybor) {
            case 1:
                SSD = new GB512_M2(RAM);
                break;
            case 2:
                SSD = new TB1_M2(RAM);
                break;
            case 3:
                SSD = new TB2_M2(RAM);
                break;
            case 4:
                SSD = new GB512_SSD(RAM);
                break;
            case 5:
                SSD = new TB1_SSD(RAM);
                break;
            case 6:
                SSD = new TB2_SSD(RAM);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println("No to teraz wybierz jaki chcesz miec dodatkowy dysk HDD i czy chcesz w ogóle\n1.brak\n2.1TB HDD\n3.2TB HDD");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC HDD = null;
        switch (wybor) {
            case 1:
                HDD = new BRAK_HDD(SSD);
                break;
            case 2:
                HDD = new TB1_HDD(SSD);
                break;
            case 3:
                HDD = new TB2_HDD(SSD);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println("Jaki potrzebujesz system operacyjny?\n1.Windows ME(99.9% poleca dany system operacyjny)\n2.Windows 11 Home\n3.Windows 11 Pro\n4.brak");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC System_operacyjny = null;
        switch (wybor) {
            case 1:
                System_operacyjny = new windowsME(HDD);
                break;
            case 2:
                System_operacyjny = new win11_home(HDD);
                break;
            case 3:
                System_operacyjny = new win11_pro(HDD);
                break;
            case 4:
                System_operacyjny = new win_brak(HDD);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println("Jaka chcesz miec obudowe?\n1.Pudelko po budach EKIN\n2.Predator z RGB");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC obudowa = null;
        switch (wybor) {
            case 1:
                obudowa = new obudowa_pudelko(System_operacyjny);
                break;
            case 2:
                obudowa = new obudowa_rgb(System_operacyjny);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println("A czy potrzebujesz dodatkowe chlodzenie?\n1.Tak\n2.Nie");
        try {
            wybor = key.nextInt();
        } catch (Exception e) {
            System.out.println("XD Zaczynasz od nowa");
            System.exit(666);
        }
        PC PC_calosc = null;
        switch (wybor) {
            case 1:
                PC_calosc = new chlodzenie(obudowa);
                break;
            case 2:
                PC_calosc = new zostaw_chlodzenie(obudowa);
                break;
            default:
                System.out.println("XD Zaczynasz od nowa");
                System.exit(666);
        }
        System.out.println(PC_calosc.description() + "\nLaczna cena to: " + PC_calosc.price() + "zl");
    }
}
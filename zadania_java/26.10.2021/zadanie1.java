package com.company;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args)
    {
        int wybor;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Kiedy się urodziłeś?\n");
        wybor=keyboard.nextInt();
        System.out.print("Urodziłeś się w "+wybor+"roku\n");
        for(int petla=wybor; petla<=2021; petla++){
            System.out.print(petla+"\n");
        }
    }
}
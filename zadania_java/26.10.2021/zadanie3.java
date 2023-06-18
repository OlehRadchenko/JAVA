package com.company;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args)
    {
        int wybor;
        int silnia=1;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Wprowadź liczbę:\n");
        wybor=keyboard.nextInt();
        System.out.print("Silnia liczby "+wybor+" to:\n");
        if(wybor==0 || wybor==1)
            silnia=1;
        for(int petla=2; petla<=wybor; petla++){
            silnia*=petla;
        }
        System.out.print(silnia);
    }
}

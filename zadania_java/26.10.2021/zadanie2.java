package com.company;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args)
    {
        int wybor;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Wprowadź liczbę:\n");
        wybor=keyboard.nextInt();
        System.out.print("Liczby podzielne przez "+wybor+"to:\n");
        for(int petla=0; petla<=1000; petla++){
            if(petla%wybor==0)
                System.out.print(petla+"\n");
        }
    }
}

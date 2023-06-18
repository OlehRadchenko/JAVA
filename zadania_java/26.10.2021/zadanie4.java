package com.company;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args)
    {
        int wybor;
        int suma=0;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Wprowadź liczbę od której zaczniemy:\n");
        wybor=keyboard.nextInt();
        suma=wybor;
        for(int petla=0; suma<=200; petla++){
            System.out.print("Wprowadź liczbę którą dodamy:\n");
            wybor=keyboard.nextInt();
            suma+=wybor;
            System.out.print(suma+"\n");
        }
        System.out.print("Suma to: "+suma);
    }
}

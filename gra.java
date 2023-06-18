package com.company;
import java.util.Random;
import java.util.Scanner;

public class gra {
    public static void main(String[] args){
        int zetony,wybor;
        int[] losowa= new int[50];
        String[] spin = new String[] {"wisnia","bomba","7","sliwka","nic","free_spin"};
        Random randomowa_liczba = new Random();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Jaką kwotę wrzucisz?(maksymalnie 50zł) 5zł=1żeton");
        wybor=klawiatura.nextInt();
        switch(wybor){
            case 5:{
                zetony=1;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 10:{
                zetony=2;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 15:{
                zetony=3;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 20:{
                zetony=4;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 25:{
                zetony=5;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 30:{
                zetony=6;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 35:{
                zetony=7;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 40:{
                zetony=8;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 45:{
                zetony=9;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            case 50:{
                zetony=10;
                System.out.println("Dostałeś "+zetony+" zetonów");
                break;
            }
            default:{
                zetony=(wybor-wybor%5)/5;
                System.out.println("Dostałeś "+zetony+" zetonów\n"+"reszta to "+wybor%5);
            }
        }
        if(zetony==0){
            System.out.println("Wrzuć pieniądze, jestem głodny  ;c");
            // metoda powrot();
        }
        for(int i=0; i<zetony;i++){
                    losowa[i] = randomowa_liczba.nextInt(6)+1;
                    losowa[i+1] = randomowa_liczba.nextInt(6)+1;
                    losowa[i+2] = randomowa_liczba.nextInt(6)+1;
                    if(losowa[i]==losowa[i+1] && losowa[i+1]==losowa[i+2]){
                        switch(losowa[i]){
                            case 1: {
                                zetony-=1;
                                System.out.println("3 wiśni \n Gratulacje wygrałeś 10 żetonów :0");
                                zetony+=10;
                                if(zetony>0)
                                System.out.println("Następny spin:");
                            }
                            case 2: {
                                zetony-=1;
                                System.out.println("3 bomby \n Gratulacje wygrałeś 5 żetonów :0");
                                zetony+=5;
                                if(zetony>0)
                                System.out.println("Następny spin:");
                            }
                            case 3: {
                                zetony-=1;
                                System.out.println("3 7 \n Gratulacje wygrałeś 20 żetonów :o");
                                zetony+=20;
                                if(zetony>0)
                                System.out.println("Następny spin:");
                            }
                            case 4: {
                                zetony-=1;
                                System.out.println("3 śliwki \n Gratulacje wygrałeś 3 żetony :3");
                                zetony+=3;
                                if(zetony>0)
                                System.out.println("Następny spin:");
                            }
                            case 5: {
                                zetony-=1;
                                System.out.println("3 X \n Nie wygrałeś :c");
                                if(zetony>0)
                                System.out.println("Następny spin:");
                            }
                            case 6: {
                                zetony-=1;
                                System.out.println("3 zera \n Gratulacje wygrałeś 1 żeton :3");
                                zetony+=1;
                                if(zetony>0)
                                System.out.println("Następny spin:");
                            }
                        }
                        System.out.println("Czy chcesz wypłacić?(1=tak, 2=nie)");
                        wybor=klawiatura.nextInt();
                        switch(wybor){
                            case 1:{
                                System.out.println("TAK");
                                break;
                            }
                            case 2:{
                                System.out.println("NIE");
                                break;
                            }
                            default:{
                                System.out.println("NIE POPRAWNA WARTOSC");
                            }
                        }
                    }else{
                        System.out.println("Przegrałeś");
                    }
                }
            }
        }
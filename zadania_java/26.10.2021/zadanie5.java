package com.company;

public class zadanie5 {
    public static void main(String[] args)
    {
        String[][] roza = new String[3][3];
        roza[0][0]="NW";
        roza[0][1]="N";
        roza[0][2]="NE";

        roza[1][0]="W";
        roza[1][1]="O";
        roza[1][2]="E";

        roza[2][0]="SW";
        roza[2][1]="S";
        roza[2][2]="SE";

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(roza[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

package com.company;

public class Task_5 {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        int array[][] = new int[x][y];

        boolean needLowTriangle;
        boolean needBrake;

        needLowTriangle = true;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                array[i][j] = (int) (Math.random() * 100);

                if (needLowTriangle && i < j) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " " + (array[i][j] < 10 ? " " : ""));
            }
            System.out.println();
        }


        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i < j && array[i][j] == 0) {
                    needBrake = true;
                    break;
                }
                if (needBrake){
                    break;
                }
                if (i > j){
                    continue;
                }
            }
        }


        System.out.println();

    }
}

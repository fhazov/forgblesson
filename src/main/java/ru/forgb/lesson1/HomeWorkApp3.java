package ru.forgb.lesson1;

import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        oneTwo();
        oneHundred();
        arrIf();
        tableXY();
        argument(3,1);
        minMax();
    }
    public static void oneTwo() {
        int [] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==1) {
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
    }
    public static void oneHundred() {
        int [] arr = new int[100];
        for (int i=0; i<arr.length; i++) {
            arr[i]=i+1;
        }
    }
    public static void arrIf() {
        int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
        }
    }
    public static void tableXY() {
        int [] [] table = new int[5][5];
        for (int i=0; i<table.length; i++) {
            for (int j=0; j<table.length;j++) {
                if (i==j) {
                    table[i][j]=1;
                }
                if (i+j+1==table.length){
                    table[i][j]=1;
                }
            }
        }
    }
    public static int [] argument (int len, int initialValue) {
        int [] arr = new int[len];
        for (int i=0; i<arr.length;i++) {
            arr[i]=initialValue;
        }
        return arr;
    }
    public static void minMax() {
        int [] arr = new int[10];
        Random rand = new Random();
        int min=99;
        int max=0;
        for (int i=0; i<arr.length; i++) {
            arr[i]=rand.nextInt(20);
            if (arr[i]<=min) {
                min=arr[i];
            }
            else if (arr[i]>=max) {
                max=arr[i];
            }
        }
    }
}

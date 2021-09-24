package ru.forgb.lesson1;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        sumTwo(10,2);
        positiveOrNegative (2);
        posOrNegBool (-99);
        printN(4, "я пишу");
        years (2020);
    }
    public static boolean sumTwo (int a, int b) {
        int sum=a+b;
        if ((10<=sum)&&(sum<=20)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void positiveOrNegative(int a) {
        if (a<0) {
            System.out.println(a + " отрицательное число");
        }
        else {
            System.out.println(a + " положительное число");
        }
    }
    public static boolean posOrNegBool (int a) {
        if (a<0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void printN(int a, String text) {
        for (int i=0; i<a; i++) {
            System.out.println(text);
        }
    }
    public static boolean years (int a) {
        if ((a%4==0)&&((a%100!=0)||a%400==0)) {
            return true;
        }
        else {
            return false;
        }
    }
}

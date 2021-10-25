package ru.forgb.lesson1;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] arr = {"1","2","3"};
        changeArr(arr,1,2);
        fruitBox();
    }
    public static void changeArr(Object[] arr, int a, int b) {
        Object temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void fruitBox() {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));

        Box<Apple> appleBox2 = new Box<>();
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));

        appleBox.pourOver(appleBox2);

        appleBox.compare(appleBox2);
    }
}

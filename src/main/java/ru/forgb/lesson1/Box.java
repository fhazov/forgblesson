package ru.forgb.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {

    private ArrayList<T> fruitList = new ArrayList<>();
    private float currentWeight = 0;

    public Box(T... fruits) {
        fruitList = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight(Fruit f1) {
        float totalWeight = 0.0f;
        for (int i = 0; i < fruitList.size(); i++) {
            totalWeight = totalWeight + fruitList.get(i).getWeight();
        }
        return totalWeight;
    }

    boolean compare(Fruit f1, Fruit f2) {
        if (getWeight(f1) == getWeight(f2)) {
            return true;
        } else return false;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }

    public void pourOver(Box<T> box) {
        box.getFruitList().addAll(fruitList);
        fruitList.clear();
    }
}

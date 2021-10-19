package ru.forgb.lesson1;

public class Swim extends Obstacle {

    private int length;

    public Swim(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Animal members) {
        members.swim(length);
    }
}

package ru.forgb.lesson1;

public class Dive extends Obstacle {

    private int length;

    public Dive(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Animal members) {
        members.dive(length);
    }
}

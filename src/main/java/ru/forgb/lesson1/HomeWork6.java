package ru.forgb.lesson1;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик",200);
        Dog dog = new Dog("Бобик", 500);
        Animal animal = new Animal("Кузя", 1000);
        cat.run(300);
        dog.run(300);
        cat.swim(5);
        dog.swim(5);
        animal.numbers();
    }
}

class Animal {
    String name;
    int len;
    int forceRun;
    public static int count = 0;
    public Animal() {

    }

    public Animal(String name, int forceRun) {
        this.name = name;
        this.forceRun = forceRun;
        count++;
    }

    public void run(int len) {
        if (len <= forceRun) {
            System.out.println(name +" пробежал " + len + " метров");
        }
        else  {
            System.out.println(name + " не может столько бегать");
        }
    }

    public void swim(int len) {
        System.out.println(name +" проплыл " + len + " метров");
    }
    public void numbers () {
        System.out.println(count + " столько животных всего создано");
    }
}

class Cat extends Animal {
    public Cat(String name, int forceRun) {
        this.name = name;
        this.forceRun=forceRun;
        count++;
    }
    public void swim (int len) {
        System.out.println(name + " не может проплыть даже метра, он котик");
    }
}

class Dog extends Animal {
    int forceSwim=10;
    public Dog (String name, int forceRun) {
        this.name = name;
        this.forceRun = forceRun;
        count++;
    }
    public void swim(int len) {
        if (len <= forceSwim) {
            System.out.println(name +" проплыл " + len + " метров");
        }
        else  {
            System.out.println(name + " не может столько плавать");
        }
    }
}
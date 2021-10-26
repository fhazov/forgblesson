package ru.forgb.lesson1;

import java.util.*;

public class HomeWork4 {
    public static void main(String[] args) {
        arrWord();
        addGetPhonebook();
    }
    public static void arrWord() {
        String word[] = new String[] {"one","two","three","four","five","one","two","8","9","10","11","12"};
        List<String> arrWords = Arrays.asList(word);
        Set<String> unique = new HashSet<String>(arrWords);

        System.out.println("Список уникальных слов:");
        System.out.println(unique.toString());

        System.out.println("Сколько раз встречается каждое слово:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(arrWords, key));
        }
    }

    public static void addGetPhonebook() {
        Phonebook phonebook = new Phonebook();
        System.out.println("Добавляем контакты");
        phonebook.add("Иванов", "12345");
        phonebook.add("Иванов", "98765");
        phonebook.add("Медведев", "23456");
        phonebook.add("Медведев", "23456");
        phonebook.add("Гайдай", "9379992");

        System.out.println("Найти номера пользователя Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Найти номера пользователя Гайдай");
        System.out.println(phonebook.get("Гайдай"));

        System.out.println("Найти номера пользователя Полищук");
        System.out.println(phonebook.get("Полищук"));
    }
}

class Phonebook {
    private HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String lastName, String number){
        if(phonebook.containsKey(lastName)){
            ArrayList<String> numbers = phonebook.get(lastName);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Контакт %s %s записан", number, lastName));
            } else {
                System.out.println(String.format("Дубликат контакта %s %s", number, lastName));
            }
        } else {
            phonebook.put(lastName, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Контакт %s %s записан", number, lastName));
        }
    }

    public ArrayList<String> get(String lastName) {
        if(phonebook.containsKey(lastName)){
            return phonebook.get(lastName);
        } else {
            System.out.println(String.format("Телефон пользователя %s отсутствует", lastName));
            return new ArrayList<>();
        }
    }

}

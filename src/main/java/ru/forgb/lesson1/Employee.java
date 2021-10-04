package ru.forgb.lesson1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private String salary;
    public int age;

    public Employee (String name, String position, String email, String phone, String salary, int age) {
        this.name=name;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }

    public void inConsole (Employee[] employee) {
        System.out.println("Name " + this.name + " Position " + this.position + " Email " + this.email + " Phone " + this.phone + " Salary " + this.salary + " Age " + this.age);
    }
}

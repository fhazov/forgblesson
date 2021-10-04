package ru.forgb.lesson1;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employeesArr = new Employee[5];
        fill(employeesArr);
        outputFor(employeesArr);
    }
    public static void fill (Employee[] employeesArr) {
        employeesArr[0] = new Employee("Ivan", "teacher", "teach@test.com", "7900123456", "20000", 23);
        employeesArr[1] = new Employee("Oleg", "director", "dir@test.com", "7910123456", "60000", 33);
        employeesArr[2] = new Employee("Sasha", "teacher", "test@test.com", "7920123456", "20000", 43);
        employeesArr[3] = new Employee("German", "doctor", "doc@test.com", "7930123456", "30000", 53);
        employeesArr[4] = new Employee("Gogi", "SMM", "smm@test.com", "7940123456", "18000", 18);
    }
    public static void outputFor (Employee[] employeesArr) {
        for (int i=0; i<employeesArr.length; i++) {
            if (employeesArr[i].age>=40) {
                employeesArr[i].inConsole(employeesArr);
            }
        }
    }
}

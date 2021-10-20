package ru.forgb.lesson1;


public class Core2 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String arr [] [] = new String[][] {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"},};
        System.out.println("Сумма - " + sumAll(arr));
    }
    public static int sumAll (String arr [] []) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length!=4){
            throw new MyArraySizeException();
        }
        for (int i=0; i<arr.length;i++) {
            for (int j=0; j<arr[i].length;j++) {
                try {
                    sum+= Integer.parseInt(arr[i][j]);
                    }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception {

    MyArraySizeException() {
        super("Массив должен быть 4x4");
    }
}

class MyArrayDataException extends Exception {

    MyArrayDataException(int i, int j) {
        super(String.format("В ячейке [%d, %d] не число", i, j));
    }
}

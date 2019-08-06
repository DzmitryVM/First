package lection03;

import java.util.Random;

public class Task3_4 {
    public static void main(String[] args) {
        int a = 9;                                                           // Начальное значение диапазона - "от"
        int b = 100;                                                         // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b);                  // Генерация 1-го числа

        int random_number2 = a + (int) (Math.random() * b);                  // Генерация 2-го числа

        int random_number3 = a + (int) (Math.random() * b);                  // Генерация 3-го числа

        int[] array = {random_number1, random_number2, random_number3};      // Запись чисел в массив и вывод его на экран
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println("  ");
        boolean vozrast = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                vozrast = false;
            }
        }
        if (vozrast) {
            System.out.println(" является строго возрастающей последовательностью ");
        } else {
            System.out.println(" не является строго возрастающей последовательностью ");
        }
    }
}
/*long[] array = new long[3];                     // генерация случайных чисел и запись сразу в массив
        for (int i = 0; i < 3; i++){
            array[i] = Math.round(Math.random() * 100);
            System.out.print(" " + array[i]);
        }*/
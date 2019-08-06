package lection03;

import java.util.Scanner; // импорт сканнера

public class Task3_10 {

    public static void main(String[] args) {
        int result = 1;
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите целое число больше 1 для расчета факториала (лучше поменьше):");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Вы ввели отрицательно число");
            } else {
                for (int i = 2; i <= num; i++) {
                    result *= i;
                    if (num == 0 || num == 1) {
                        System.out.println(result);
                    }
                }
            }
            System.out.println(result);
            sc.close();
        }while (num<0);
    }
}



        /*int[] array = new int[Math.toIntExact(num)]; // создаем массив с длиной, равной введенному числу
        for(int i = 1; i <= num; i++) {              // записываем в массив цифры от 1 до num, т.е. введенного числа
            for (long ind = 0; ind < array.length; ind++) {
                array[Math.toIntExact(ind)] = i;
                System.out.print(" " + array[Math.toIntExact(ind)]);
            }
        }
        for (long j=0; j < array.length; j++) {
            int result = 1;
            result = result * array[Math.toIntExact(j)]; // * array[Math.toIntExact((j + 1))];
            System.out.println("Факториал введенного числа равен: " + j);
        }*/


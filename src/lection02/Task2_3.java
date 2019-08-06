package lection02;

import java.util.Scanner; // импорт сканнера

public class Task2_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");

        int year = sc.nextInt(); // считывает год

        if(year%400 == 0) {
            System.out.println("Год високосный");

        } else if (year%100 == 0) {
            System.out.println("Год невисокосный");

        } else if (year%4 == 0) {
            System.out.println("Год високосный");

        } else {
            System.out.println("Год невисокосный");

        }

        sc.close();

    }
}

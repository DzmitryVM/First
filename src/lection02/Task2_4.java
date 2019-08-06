package lection02;

import java.util.Scanner; // импорт сканнера

public class Task2_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день:");

        int dd = sc.nextInt(); // считывает день

        System.out.println("Введите месяц:");

        int mm = sc.nextInt(); // считывает месяц

        System.out.println("Введите год:");

        int yyyy = sc.nextInt(); // считывает год

        //int type_mm = mm%2 // определитель четного и нечетного месяца

        if(yyyy < 2020 && mm == 1 && dd <= 31) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна"); // проходим по всем месяцам кроме февраля

        } else if(yyyy < 2020 && mm == 3 && dd <= 31) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 5 && dd <= 31) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 7 && dd <= 31) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 8 && dd <= 31) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 10 && dd <= 31) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 12 && dd <= 31) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 4 && dd <= 30) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 6 && dd <= 30) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 9 && dd <= 30) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && mm == 11 && dd <= 30) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if(yyyy < 2020 && yyyy%400 == 0 && mm == 2 && dd <= 29) {                               // определяем високосный год
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if (yyyy < 2020 && yyyy%100 == 0 && mm == 2 && dd <= 28) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if (yyyy < 2020 && yyyy%4 == 0 && mm == 2 && dd <= 29) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else if (yyyy < 2020 && mm == 2 && dd <= 28) {
            System.out.println("Введенная дата: " + dd + "." + mm + "." + yyyy + "- реальна");

        } else {
            System.out.println("Неверно введена дата");
        }



        sc.close();

    }
}

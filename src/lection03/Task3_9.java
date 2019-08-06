package lection03;

import java.util.Scanner; // импорт сканнера

public class Task3_9 {

    public static void main(String[] args) {
        int temp;
        boolean primeNumber = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число больше 0:");

        int num = sc.nextInt(); // считывает число

        for (int i=2; i<= num/2; i++){ // проверка простое ли число
            temp = num%i;
            if(temp==0){
                primeNumber = false;
                break;
            }
        }
        if (primeNumber) {
            System.out.println("Введенное вами число " + num + " является простым");
        }else {
            System.out.println("Введенное вами число " + num + " не является простым");
        }

        sc.close();

    }
}

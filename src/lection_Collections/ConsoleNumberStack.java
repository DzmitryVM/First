package lection_Collections;

/* 4.	Ввести с консоли число, занести его цифры в стек.
* Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
* •	Задать размер стека.
* •	Внести цифру в стек.
* •	Извлечь цифру из стека.
* Вывести число, у которого цифры идут в обратном порядке.
 */

import java.util.Scanner;

public class ConsoleNumberStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное целочисленное число: ");
        Integer number = sc.nextInt();
        if (number>0) {
            System.out.println("Ваше число: " + number);

            MyStack myStackExample = new MyStack(number);
            System.out.println("Длина стэка: " + myStackExample.setStackSize()); // проверка правильности установления длины стэка
            myStackExample.addNumberToStack();
            System.out.print("Текущий стэк: ");  // просмотр стэка для сверки с числом
            myStackExample.getMyStack();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("\nВведите номер элемента стэка для извлечения: ");
            int indexOfElement = sc2.nextInt();
            if (indexOfElement<0) {
                System.out.println("Вы ввели отрицательное число. Номер элемента должен быть положительным числом.");
            } else if (indexOfElement >= myStackExample.setStackSize()) {
                System.out.println("Такой позиции в стэке не существует. Попробуйте ввести меньшее число.");
            } else {
            System.out.print("Искомая цифра: ");
            myStackExample.getNumberFromStack(indexOfElement);
            System.out.println("Число в обратном порядке: ");
            myStackExample.getReverseNumber();}
        } else {
            System.out.println("Введенное число не соответствует условию. Попробуйте еще раз.");
        }
        sc.close();
    }
}

package lection_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

/* 7.	Использовать Алгоритмы. Не используя вспомогательных объектов, переставить отрицательные элементы
 * сгенерированного списка в конец, а положительные – в начало этого списка. */

public class NegativePositiveSorting {
    public static void main(String[] args) {

        createList();
        System.out.println("Input list: " + list);

        // способ №1
        int length = list.size();                                                                 // размер списка
        int indFromBegin = 0;                                                                     // индекс с начала списка
        int indFromEnd = list.size()-1;                                                           // индекс с конца списка
        int replaceQuantity = 0;                                                                  // кол-во перенесенных элементов
        while ( indFromBegin < length-1 - replaceQuantity && indFromEnd > indFromBegin) {         // выполняем пока индексы не встретяться
            if (list.get(indFromBegin) < 0 && list.get(indFromEnd)>=0) {
                Collections.swap(list, indFromBegin, indFromEnd);                                 // меняем местами отрицательный элемент и последний из положительных
                replaceQuantity++;                                                                // увеличиваем кол-во перенесенных элементов и меняем индексы
                indFromEnd--;
                indFromBegin++;
            } else if(list.get(indFromBegin) < 0 && list.get(indFromEnd)<0) {
                indFromEnd--;                                                                     // ищем последний положительный элемент
            } else {
                indFromBegin++;                                                                   // переходим к след элементу
            }
        }
        System.out.println("First method result list: " + list);

        // способ №2
        int len = list.size();                  // размер списка
        int i = 0;                              // текущий индекс
        int replace = 0;                        // кол-во перенесенных элементов
        while ( i < len - replace) {                  // выполняем пока текущий элемент не будет последним не обработанным элементом
            if (list.get(i) < 0) {
                list.add(len - 1, list.remove(i));    // переносим отрицательный элемент в конец списка
                replace++;                            // увеличиваем кол-во перенеснных элементов
            } else {
                i++;                                  // иначе переходим к след элементу
            }
        }
        System.out.println("Second method result list: " + list);
    }

    public static List<Integer> list = new ArrayList<Integer>();

    public static void createList(){              // метод для заполнения 10-ю случайными числами
        Random random = new Random();
        for (int i=0; i<10; i++){
            int number = -10 + random.nextInt(20+1);     // случайное число от -10 до 10
            list.add(number);
        }
    }
}

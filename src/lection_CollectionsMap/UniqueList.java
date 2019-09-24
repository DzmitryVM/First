package lection_CollectionsMap;

/*1. Написать метод countUnique, который принимает целочисленный список в качестве параметра
 и возвращает количество уникальных целых чисел в этом списке.
При получении пустого списка метод должен возвращать 0.
Пример:

[3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.

* */

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class UniqueList {
    public static void main(String[] args) {
        ArrayList<Integer> set1 = new ArrayList<>();
        int sizeOfSet = 10;
        for (int i=0; i<sizeOfSet; i++) {
            set1.add(i,(int)(-10 + (Math.random()*20+1))); // заполняем случайными числами в диапазоне -10-
        }
        System.out.println(set1);
        System.out.println("Method 1 result: " + countUnique(set1));
        System.out.println("Method 2 result: " + countUniqueTwo(set1));
    }

    public static int countUnique (ArrayList set1){  // 1-й вариант
        Set <Integer> unSet = new HashSet<>();
        unSet.addAll(set1);                          // записываем уникальные значения массива в список
        int result = unSet.size();                   // и выводим его размер
        return result;
    }

    public static int countUniqueTwo (ArrayList set1) { // 2-й вариант: используем решение задачи FrequencyDictionary
        int countQuantity = 0;
        Map<Integer, Integer> uniqueSet = new HashMap<>();
        for(Object num: set1) {
            if(uniqueSet.containsKey(num)) {
                uniqueSet.put((Integer) num, uniqueSet.get(num) + 1);     // заносим элементы в коллекцию и подсчитываем кол-во
            }
            else {
                countQuantity++;
                uniqueSet.put((Integer) num, 1);
            }
        }
        return countQuantity;
    }
}

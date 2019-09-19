package lection_Collections;

import java.util.HashSet;
import java.util.Set;

/* 5.	Определить множество на основе множества целых чисел. Создать методы
для определения пересечения и объединения множеств.  */

public class CrossPlenty {
    public static Set<Integer> union (Set set1, Set set2){
        Set<Integer> union = new HashSet<Integer>();
            union.addAll(set1);
            union.addAll(set2);
        {
            return union;
        }
    }

    public static Set<Integer> intersect (Set set1, Set set2) {
        Set<Integer> intersect = new HashSet<Integer>();
        for (Object i: set1){          // сравниваем значения элементов множеств
            for (Object j : set2){
                if (i==j){             // если равны, записываем в новое множество
                    intersect.add((Integer) i);
                }
            }
        }
        return intersect;
    }
}

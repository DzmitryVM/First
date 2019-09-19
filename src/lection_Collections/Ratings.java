package lection_Collections;

/* 1.	Задание. Создать список оценок учеников с помощью ListIterator,
заполнить случайными оценками. Удалить неудовлетворительные оценки из списка. */

import java.util.ArrayList;
import java.util.ListIterator;

public class Ratings {
    public static void main(String[] args) {
        int ratingsQuantity = 10;
        int negative = 3;             // т.к. 3-"удовлетворительно", все, что ниже - "неуд"
        ArrayList<Integer> ratings = new ArrayList<>();
        for (int i=0; i<ratingsQuantity; i++) {
            ratings.add(i,(int)(Math.random()*(5-1)+1)); // заполняем случайными числами в диапазоне 1-5
        }

        System.out.println(ratings);

        for (ListIterator<Integer> ratingList = ratings.listIterator(); ratingList.hasNext();)
            if (ratingList.next()<negative) {
                ratingList.remove();
            }
        System.out.println(ratings);
    }
}

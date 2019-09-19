package lection_Collections;

/* 2.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
* Найти самую высокую оценку с использованием итератора.
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class MaxRating {

    public static void main(String[] args) {
        int ratingsQuantity = 10;
        ArrayList<Integer> ratings = new ArrayList<>();
        for (int i=0; i<ratingsQuantity; i++) {
            ratings.add(i,(int)(Math.random()*(5-1)+1)); // заполняем случайными числами в диапазоне 1-5
        }
        Collections.sort(ratings);
        System.out.println(ratings);

        ListIterator<Integer> ratingList = ratings.listIterator();
        Integer maxRating = 0;
        while (ratingList.hasNext()) {
            maxRating=ratingList.next();
        }
        System.out.println(maxRating);
    }
}

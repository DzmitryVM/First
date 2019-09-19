package lection_Collections;

import java.util.HashMap;
import java.util.Map;

/* 6.	Имеется текст. Следует составить для него частотный словарь. */

public class FrequencyDictionary {
    public static void main(String[] args) {
        String str = ("Один, два плюс два, три плюс три плюс три, "
                + "четыре плюс четыре плюс четыре плюс четыре, "
                + "пять плюс пять плюс пять плюс пять плюс пять.");
        /*String str = ("One, two plus two, three plus three plus three, "         // вариант с латиницей
                + "four plus four plus four plus four, five plus five plus "
                + "five plus five plus five.");*/
        str = str.toLowerCase();
        str = str.replaceAll("[^а-я]", " ");  // удаление знаков. Для варианта с латиницей regex: "\\W"

        Map<String, Integer> map = new HashMap<>();
        for(String s: str.split(" ")) {   // разделяем строку на слова методом split
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);     // заносим в коллекцию
            }
            else {
                map.put(s, 1);
            }
        }
        map.remove("");
        System.out.println(map);
    }
}

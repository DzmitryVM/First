package lection_CollectionsMap;

/* 3. Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
Ключ: номер степени
Значение: значение множителя

Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
 */

import java.util.*;

public class SumOfHashMaps {
    public static void main(String[] args) {
        Map<Integer, String > map1 = new HashMap<>();
        map1.put(6,"a");
        map1.put(4,"b");
        System.out.println("First map: " + map1);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3,"c");
        map2.put(1,"d");
        map2.put(0,"8");
        System.out.println("Second map: " + map2);

        map1.putAll(map2);
        System.out.println("Result map: " + map1);

        List<Integer> keysOfMap = new ArrayList<>(map1.keySet());
        List<String> valuesOfMap = new ArrayList<>(map1.values());
        // т.к. длины двух списков равны, то шаг в цикле одинаков для обоих
        System.out.print("Result: ");
        for (int i=keysOfMap.size()-1; i >0; i--) {
            System.out.print(valuesOfMap.get(i)+"x^" + keysOfMap.get(i) + " + ");
        }
        System.out.print(valuesOfMap.get(0));
    }
}

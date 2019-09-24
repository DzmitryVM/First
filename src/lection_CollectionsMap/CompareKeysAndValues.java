package lection_CollectionsMap;

/* 2. Написать метод isUnique, который принимает Map<String, String> и возвращает true,
если два различных ключа не соответствуют двум одинаковым значениям.
Например, в данном случае вернётся true:

{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}

А в данном - false:

{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class CompareKeysAndValues {

    /* Исходим из того, что ключ в HashMap всегда является уникальным.
    * Соответственно, надо искать повторяющиеся значения.
    * Далее исходим из того, что в Set могут быть тоже только уникальные значения */

    public static void main(String[] args) {
        Map<String, String > map1 = new HashMap<>();
        map1.put("Marty","Stepp");
        map1.put("Stuart","Reges");
        map1.put("Jessica","Miller");
        map1.put("Amanda","Camp");
        map1.put("Hal","Perkins");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");

        System.out.println("Result of comparing values of map1: " + compareMap(map1));
        System.out.println("Result of comparing values of map2: " + compareMap(map2));
    }

    public static boolean compareMap (Map anyMap) {
        boolean compareResult=true;
        Set<String> valuesOfMap = new HashSet<>(anyMap.values()); // получаем отдельный список только уникальных значений
        if(valuesOfMap.size() < anyMap.size()) {                // и сравниваем длину полученного списка с длиной исходной Map
            compareResult = false;     // если меньше, то были повторяющиеся значения элементов
        }
        else {
            compareResult = true;
        }
        return compareResult;
    }
}

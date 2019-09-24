package lection_CollectionsMap;

/* 4. Реализовать структуру «Черный ящик» хранящую целые числа.
* Структура должна поддерживать операции добавления числа и возвращение
* К-го по минимальности числа и N-ного по максимальности элемента из ящика.*/

import java.util.*;

public class BlackBox {
    public static void main(String[] args) {
        ArrayList<Integer> demoBox = createMyArrayList();        // создаем "Черный ящик" на основе ArrayList
        System.out.println(demoBox);                             // выводим его в консоль для сверки
        System.out.println(arrayListToTreeMap(demoBox));         // выводим для проверки в консоль TreeMap
        try {
            System.out.println(getMinNumber(demoBox));               // получаем К-е по минимальности число
            System.out.println(getMaxNumber(demoBox));               // получаем N-е по максимальности число
            System.out.println(addNumberToMyList(demoBox));          // добавляем элемент
        } catch (Exception e){
            System.out.println("Введено нецелое число!");
        }
    }

    public static ArrayList<Integer> createMyArrayList (){
        ArrayList<Integer> myList = new ArrayList<>();
        int sizeOfList = 10;
        for (int i = 0; i < sizeOfList; i++) {
            myList.add(i, (int) (-10 + (Math.random() * 20 + 1))); // заполняем случайными числами в диапазоне
        }
        return myList;
    }

    public static List addNumberToMyList (ArrayList myList) throws Exception{
        Scanner getNewNumber = new Scanner(System.in);
        System.out.println("Введите добавляемое целое число: ");
        Integer newNumber = getNewNumber.nextInt();
        myList.add(newNumber);
        arrayListToTreeMap(myList);
        return myList;
    }
    // т.к. в TreeMap элементы отсортированы по возрастанию, позиция вызываемого числа будет соответствовать его ключу в TreeMap
    public static Integer getMinNumber (ArrayList myList) throws Exception{
        arrayListToTreeMap(myList);
        Scanner getIndexOfMinNumber = new Scanner(System.in);
        System.out.println("Введите индекс К-го по минимальности числа (целое число от 0 и не более " + myList.size() + "): ");
        Integer indexMin = getIndexOfMinNumber.nextInt();
        if (indexMin > myList.size()) {
            System.out.println("Введенное число превышает количество элементов в хранилище!");
            return getMinNumber(myList);
        } else {
            System.out.print("Искомое число: ");
            return arrayListToTreeMap(myList).remove(indexMin);
        }
    }

    // т.к. в TreeMap элементы отсортированы по возрастанию, позиция вызываемого числа будет соответствовать длине TreeMap-(введенное число-1)
    public static Integer getMaxNumber (ArrayList myList) throws Exception{
        arrayListToTreeMap(myList);
        Scanner getIndexOfMaxNumber = new Scanner(System.in);
        System.out.println("Введите индекс N-го по максимальности числа (целое число от 0 и не более " + myList.size() + "): ");
        Integer indexMax = getIndexOfMaxNumber.nextInt()-1;
        if (indexMax >= myList.size()){
            System.out.println("Введенное число превышает количество элементов в хранилище!");
            return getMaxNumber(myList);
        } else {
            System.out.print("Искомое число: ");
            return arrayListToTreeMap(myList).remove((myList.size()-indexMax));
        }
    }

    public static Map <Integer,Integer> arrayListToTreeMap (ArrayList myList){
        Map <Integer, Integer> myTreeMap = new TreeMap<>();
        for (int i=myList.size()-1; i >=0; i--) {                        // сортируем ArrayList по возрастанию
            for (int j = 0; j < i; j++) {
                if ((Integer) myList.get(j) > (Integer) myList.get(j+1)) {
                    int tmp = (int) myList.get(j);
                    myList.set(j,myList.get(j+1));
                    myList.set(j+1, tmp);
                }
            }
            myTreeMap.put(i+1, (Integer) myList.get(i));                // переносим числа в TreeMap
        }
        return myTreeMap;
    }
}

package lection_Strings;

import java.lang.reflect.Array;

/** Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами  */


public class Task5_WordsQuantity {
    public static void main(String[] args) {
        System.out.println(countWordsQuantity(" Количество слов в  тексте  "));
    }

    private static int countWordsQuantity (String str){
        char [] strArray = str.trim().toCharArray();   // отсекаем пустые символы в начале и конце строки и преобразовываем строку в массив
        int spaceQuantity = 0;
        for (int i=0; i < strArray.length; i++) {       // считаем кол-во промежутков между словами, если между словами
            if (strArray[i] == ' ' && strArray[i] != strArray[i + 1] && i + 1 < strArray.length) {           // по одному пробелу
                spaceQuantity ++;
            } else if (strArray[i] == ' ' && strArray[i] == strArray[i + 1] && i + 1 < strArray.length) {   // по несколько пробелов
                spaceQuantity += 0;
            }
        }

        return spaceQuantity+1;                  // выводим кол-во слов = кол-во пробелов+1
    }
}

package lection_Strings;

import java.util.Arrays;

/** Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов,
 * дополненных слева нулями. Если число выходит за размер 10 символов вернуть все нули.
 * Пример getString(22) -> 0000000022
 * Найти 3 способа решения задачи и определить наиболее быстрый способ
 */


public class Task7_StringAndZero {
    public static void main(String[] args) {
        System.out.println(addZeroFirst(123456L));
        System.out.println(addZeroSecond(123456L));
        System.out.println(addZeroThird(123456L));
    }

    public static String addZeroFirst(long num) {
        long timeStartFirst = System.nanoTime();
        String numStr = new String();
        int [] numArray = new int [10];
        StringBuilder addZeroBuild = new StringBuilder ("");
        if (num >= 10000000000L) {           // проверяем, если количество символов > 10
            numStr = "0000000000";
        } else {
            for (int i=9; i>=0; i--) {       // записываем в массив значения 1-го,2-го...10-го символов в обратном порядке
                numArray[i] = (int) ((num%Math.pow(10, i+1))/Math.pow(10, i));
                addZeroBuild.append(numArray[i]); // переносим значение символов массива в StringBuilder в нужном порядке
                }
            numStr = addZeroBuild.toString();
            }
        long timeFinishFirst = System.nanoTime();
        long timeResultFirst = timeFinishFirst - timeStartFirst;
        System.out.println("Время обработки первым способом: " + timeResultFirst);
        return numStr;
    }

    public static String addZeroSecond (long num) {
        long timeStartSecond = System.nanoTime();
        String numStr = new String();
        if (num >= 10000000000L) {           // проверяем, если количество символов > 10
            numStr = "0000000000";
        } else {
            numStr = String.valueOf(num);    // преобразовываем число в строку
            StringBuilder addZeroToString = new StringBuilder("");
            for (int i=0; i<(10-numStr.length()); i++) {       // записываем нули в StringBuilder
                addZeroToString.append(0);
            }
            addZeroToString.append(numStr);
            numStr = addZeroToString.toString();
        }
        long timeFinishSecond = System.nanoTime();
        long timeResultSecond = timeFinishSecond - timeStartSecond;
        System.out.println("Время обработки вторым способом: " + timeResultSecond);
        return numStr;
    }

    public static String addZeroThird (long num) {
        long timeStartThird = System.nanoTime();
        String numStr = "";                                               // создаем пустую результирующую строку
        char [] numArray = String.valueOf(num).toCharArray();             // преобразуем число в строку, а ее передаем в массив
        char [] emptyArray = {'0','0','0','0','0','0','0','0','0','0'};   // создаем массив их 10 нулей
        if (num >= 10000000000L) {                                        // проверяем, если количество символов > 10
            numStr = "0000000000";
        } else {
            StringBuilder resultString = new StringBuilder();             // вариант а) работаем через StringBuilder, в варианте б) эта строка не нужна
            for (int i=10-numArray.length; i<10; i++) {                   // вместо нулей на соответствующих позициях
                emptyArray[i] = numArray[(i+numArray.length)%10];         // записываем введенное число
            }
            for (int j=0; j<10; j++) {                                    // к пустой результирующей строке добавляем значения полученного массива
                numStr = resultString.append(emptyArray[j]).toString();   // вариант а) работает быстрее
                //numStr += emptyArray[j];                                // вариант б) но этот вариант работает дольше
            }
        }
        long timeFinishThird = System.nanoTime();
        long timeResultThird = timeFinishThird - timeStartThird;
        System.out.println("Время обработки третьим способом: " + timeResultThird);
        return numStr;
    }
    /*public static String addZeroFourth (long num) {
        long timeStartFourth = System.nanoTime();
        String numForWork = String.valueOf(num);              // число преобразуем в строку
        String numStr = "0000000000";        // создаем строку с 10-ю нулями
        if (num >= 10000000000L) {           // проверяем, если количество символов > 10
            numStr = "0000000000";
        } else {
            for (int i=9; i<(10-numStr.length()); i--) {       // записываем нули в массив
            numStr = numStr.replace( , numForWork);
            }
        }
    long timeFinishFourth = System.nanoTime();
    long timeResultFourth = timeFinishFourth - timeStartFourth;
        System.out.println("Время обработки четвертым способом: " + timeResultFourth);
        return numStr;
    }*/
}

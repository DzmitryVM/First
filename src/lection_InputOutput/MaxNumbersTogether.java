package lection_InputOutput;

import java.io.*;
import java.util.*;

/*4. Задан файл с текстом. В каждой строке найти и вывести
* наибольшее число цифр, идущих подряд. */

public class MaxNumbersTogether {
    public static void main(String[] args) {
        File file = new File("src\\StringAndNumbers.txt");
        Map<Integer, Integer> numbersMap = new HashMap<>();
        int counterString = 1;
        int counterNumbers = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int temp;
            while ((temp = fileInputStream.read()) >= 0) {
                while (temp != '\n' & temp >= 0) {
                    if (Character.isDigit(temp)) {
                        counterNumbers = 0;
                        numbersMap.putIfAbsent(counterString, counterNumbers);
                        while (Character.isDigit(temp)) {
                            temp = fileInputStream.read();
                            counterNumbers++;
                        }
                        if (counterNumbers > numbersMap.get(counterString)) {
                            numbersMap.put(counterString, counterNumbers);
                        }
                    } else {
                        temp = fileInputStream.read();
                    }
                }
                counterString++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Integer, Integer> pair : numbersMap.entrySet()) {
            System.out.println("In the row # " + pair.getKey() + " max quantity of numbers together is " + pair.getValue());
        }
    }
}

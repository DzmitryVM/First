package lection_InputOutput;

/* 2. Задан файл с текстом, найти и вывести в консоль все слова,
* начинающиеся с гласной буквы.*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VoidWordsBeginWithVowel {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader fileText = null;
        try {
            fileText = new BufferedReader(new FileReader("src\\FileForTest.txt"));
            String text;
            while ((text = fileText.readLine()) != null) {
                //System.out.println(text);     // для проверки считывания текста
                System.out.print(VowelLetterMethod.findWord(text)+ " ");
            }
        } finally {
            fileText.close();
        }
    }
}

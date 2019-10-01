package lection_InputOutput;

/*3. Задан файл с текстом, найти и вывести в консоль все слова,
для которых последняя буква одного слова совпадает с первой буквой следующего слова */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordsEndEqualBegin {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader fileText = null;
        try {
            fileText = new BufferedReader(new FileReader("src\\FileForTest.txt"));
            String text;
            while ((text = fileText.readLine()) != null) {
                //System.out.println(text);     // для проверки считывания текста
                EndEqualBegin.findWordEqual(text);
            }
        } finally {
            fileText.close();
        }
    }
}

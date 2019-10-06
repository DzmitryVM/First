package lection_InputOutput;

import java.io.*;
import java.util.*;

/*5. Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
Прочитать записанный файл, распечатать числа и их среднее арифметическое. */


public class BinFileWriteRead {
    public static void main(String[] args) {
        File file = new File("src\\Number.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             FileInputStream fileInputStream = new FileInputStream(file)) {
            Random random = new Random();

            int intOutput;
            byte byteOutput;

            for (int i = 0; i < 20; i++) {
                intOutput = random.nextInt(255)+256;
                for (int j = 0; j <= 3; j++) {
                    byteOutput = (byte) (intOutput >> j*8);
                    fileOutputStream.write(byteOutput);
                }
            }
            int input;
            int res;
            while((input = fileInputStream.read()) >= 0){
                res = 0;
                for (int j = 0; j <=3; j++) {
                    res = res | (input << j*8);
                    if (j !=3) {
                        input =fileInputStream.read();
                    }
                }
                System.out.println("Result: "+res);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

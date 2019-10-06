package lection_InputOutput;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

/*7. Задан файл с java-кодом. Прочитать текст программы из файла и записать
* в другой файл в обратном порядке символы каждой строки.  */

public class ReverseJavaCode {

    public static void main(String[] args) {
        File fileJava = new File("src\\FileWithJavaCode.txt");
        File fileNew = new File("src\\ReverseJavaCode.txt");

        try(FileInputStream fileJavaInput = new FileInputStream(fileJava);
            FileOutputStream fileNewOutput = new FileOutputStream(fileNew);
            FileInputStream fileNewInput = new FileInputStream(fileNew)){

            int temp;
            List<Character> list = new ArrayList<>();
            while((temp = fileJavaInput.read()) >= 0){
                list.add((char) temp);
                while(temp != '\n' & temp >= 0){
                    temp = fileJavaInput.read();
                    list.add((char) temp);
                }
                for (int i = list.size()-1; i >= 0; i--) {
                    fileNewOutput.write(list.get(i));
                }
                list.clear();
            }
            System.out.println("File with reverse Java-code");
            int print;
            while((print = fileNewInput.read()) >= 0){
                System.out.print((char)print);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

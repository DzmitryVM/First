package lection_IOBuferAndSeria;

import java.io.*;

/* 1.	Сравнить скорость чтения и записи 5 МБ символов при использовании
классов буфиризированого и не буфиризированого символьного ввода вывода.*/

public class ReadWriteSpeed {
    public static void main(String[] args) {

        File file = new File("src\\lection_IOBuferAndSeria\\WriteRead.txt");

        CompareSpeed fileNotBuf = new CompareSpeed(file);
        CompareSpeed fileBuf = new CompareSpeed(file);
        fileNotBuf.notBuf();fileBuf.buf();
    }
}

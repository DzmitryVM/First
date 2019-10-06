package lection_IOBuferAndSeria;

import java.io.*;
import java.util.Random;

public class CompareSpeed {
    File file;

    CompareSpeed(File file){
        this.file = file;
    }

    public void notBuf(){
        Random random = new Random();
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream(file)){
            System.out.println("Старт НЕ буферезированой записи в файл на 5 мб");
            long startWriteNotBuf = System.nanoTime();
            while(file.length() < 5e+6){
                fileOutputStream.write((char) random.nextInt());
            }
            long endWriteNotBuf = System.nanoTime();
            System.out.println("Конец НЕ буферезированной записи: " + (endWriteNotBuf-startWriteNotBuf)/1e+9 + " секунд");
            System.out.println("Старт НЕ буферезированого чтения файла размером 5 мб");
            int i;
            long startReadNotBuf = System.nanoTime();
            while((i=fileInputStream.read())>=0){
                //ничего не делаем
            }
            long endReadNotBuf = System.nanoTime();
            System.out.println("Конец НЕ буферезированного чтения: " +(endReadNotBuf-startReadNotBuf)/1e+9 + " секунд");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void buf(){
        Random random = new Random();
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            System.out.println("Старт буферезированой записи в файл на 5 мб");
            long startWriteBuf = System.nanoTime();
            while(file.length() < 5e+6){
                bufferedOutputStream.write((char) random.nextInt());
            }
            long endWriteBuf = System.nanoTime();
            System.out.println("Конец буферезированной записи: " +(endWriteBuf-startWriteBuf)/1e+9 + " секунд");
            System.out.println("Старт буферезированого чтения файла размером 5 мб");
            int i;
            long startReadBuf = System.nanoTime();
            while((i=bufferedInputStream.read())>=0){
                // ничего не делаем
            }
            long endReadBuf = System.nanoTime();
            System.out.println("Конец буферезированного чтения: " +(endReadBuf-startReadBuf)/1e+9+ " секунд");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

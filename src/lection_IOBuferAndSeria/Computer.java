package lection_IOBuferAndSeria;

import java.io.*;

/*2.	Создать класс Computer. Добавить ему несколько полей, создать объект этого класса,
* сериализовать в файл.
* Десериализовать объект из того же файла, вывести значения полей в консоль.
 */

public class Computer implements Serializable{

    public static void main(String[] args) {
        try{
            Computer computer = new Computer(100,20);
            computer.serializeComputer(computer);
            computer.deserializeComputer();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static final long serialVersionUID = 123456789L;
    int number;
    int time;

    Computer(int number, int time){
        this.number = number;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "number=" + number +
                ", time=" + time +
                '}';
    }

    public void serializeComputer(Computer computer) throws IOException {
        FileOutputStream outputStream = new FileOutputStream
                ("src\\lection_IOBuferAndSeria\\Computer.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(computer);
        System.out.println("Итог сериализации: " + computer.toString());
        objectOutputStream.close();
    }

    public Computer deserializeComputer() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream
                ("src\\lection_IOBuferAndSeria\\Computer.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Computer computer = (Computer) objectInputStream.readObject();
        System.out.println("Итог десериализации: " + computer);
        return computer;
    }
}

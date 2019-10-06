package lection_IOBuferAndSeria;

import java.io.*;

/*3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле
* типа Touchpad - также созданного класса со своими полями.
* Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
* Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */

public class Notebook extends Computer {

    public static void main(String[] args) {
        try{
            Touchpad touchpad = new Touchpad(true);
            Notebook notebook = new Notebook(111, 30, 222, touchpad, true);
            notebook.serializeComputer(notebook);
            notebook.deserializeComputer();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static final long serialVersionUID = 987654321L;

    Notebook(int number, int time, int power, Touchpad touchpad, boolean internet) {
        super(number, time);
        this.touchpad = touchpad;
        this.power = power;
        this.internet = internet;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "power=" + power +
                ", internet=" + internet +
                ", touchpad power=" + touchpad.isFlag +
                ", touchpad location=" + touchpad.a + " " + touchpad.b +
                ", number=" + number +
                ", time=" + time +
                '}';
    }

    transient int power;
    boolean internet;
    Touchpad touchpad;

    public void serializeNotebook(Notebook notebook) throws IOException {
        FileOutputStream outputStream = new FileOutputStream
                ("src\\lection_IOBuferAndSeria\\Notebook.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(notebook);
        System.out.println("Итог сериализации: " + notebook.toString());
        objectOutputStream.close();
    }

    public Notebook deserializeNotebook() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream
                ("src\\lection_IOBuferAndSeria\\Notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Notebook notebook = (Notebook) objectInputStream.readObject();
        System.out.println("Итог десериализации " + notebook);
        return notebook;
    }
}

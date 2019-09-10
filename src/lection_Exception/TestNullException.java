package lection_Exception;

/* 1. Объявите переменную со значением null. Вызовите метод у этой переменной.
* Отловите возникшее исключение.
*/

public class TestNullException {

        public static String getName (String name) throws Exception {
        if (name.equals("")) throw new Exception("The name can't be null");
        return name;
        }

    public static void main(String[] args) {
        try {
            String name = "";
            System.out.println(getName(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

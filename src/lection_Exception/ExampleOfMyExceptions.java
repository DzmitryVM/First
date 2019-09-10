package lection_Exception;

/* 3.	Создать собственный класс-исключение - наследник класса Exception.
          Создать метод, выбрасывающий это исключение.
          Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 */

public class ExampleOfMyExceptions {

    public static void main(String[] args) throws MyException {
        try {
            example();
            } catch (MyException ex) {
            ex.printStackTrace();
            System.out.println("MyException was catching");
        }
        try {
            exampleRuntime();
        } catch (MyRuntimeException ex) {
            ex.printStackTrace();
            System.out.println("MyRuntimeException was catching");
        }
    }

    public static void example() throws MyException {
        System.out.println("Show this before catching MyException from method example");
        throw new MyException("This is MyException");
    }

    public static void exampleRuntime () throws MyRuntimeException {
        System.out.println("Show this before catching MyRuntimeException from method exampleRuntime");
        throw new MyRuntimeException("This is MyRuntimeException");
    }

}

package lection_Exception;

public class MyException extends Exception {

    MyException(){};

    public MyException(String message) {
        super(message);
    }
}
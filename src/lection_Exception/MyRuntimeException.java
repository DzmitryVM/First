package lection_Exception;

public class MyRuntimeException extends RuntimeException {
    MyRuntimeException (){};

    public MyRuntimeException (String message) {
        super(message);
    }
}

package lection_Exception;

/* 5.	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
указав в качестве причины отловленное.*/

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class ExampleMyAndJDKException {

    public static void main(String[] args) throws MyJDKException{
        try {
            testMethod();
        } catch (ClassCastException e){
            e.printStackTrace();

        }
    }

    public static void testMethod () throws MyJDKException {
        byte b=1;
        int i=3;
        System.out.println(b+=i);
        throw new ClassCastException("MyJDKException");
    }
}

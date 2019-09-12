package lection_Generics;

/*4.	Из задания 5.3 реализовать класс вычислитель для вещественных и целых типов данных,
* используя параметризацию классов */

import java.math.BigDecimal;
import java.math.BigInteger;

public class GenericsForWrappers<T1,T2> {
    private T1 arg1;
    private T2 arg2;

    public GenericsForWrappers (T1 argT1, T2 argT2) {
        arg1 = argT1;
        arg2 = argT2;
    }

    public T1 getArg1 (){return arg1;}
    public T2 getArg2 () {return arg2;}

    public static Integer result1 (){
        GenericsForWrappers <Integer, Integer> gfw1 = new GenericsForWrappers(2, 3);
        return (gfw1.getArg1()+gfw1.getArg2());
    }

    public static Double result2 (){
        GenericsForWrappers <Double, Double> gfw1 = new GenericsForWrappers(4.6, 2.3);
        return (gfw1.getArg1()-gfw1.getArg2());
    }

    public static BigInteger result3 (){
        GenericsForWrappers <BigInteger, BigInteger> gfw1 = new GenericsForWrappers(BigInteger.valueOf(123456789), BigInteger.valueOf(100000000));
        BigInteger res3;
        return res3 = gfw1.getArg1().multiply(gfw1.getArg2());
    }

    public static BigDecimal result4 (){
        GenericsForWrappers <BigDecimal, BigDecimal> gfw1 = new GenericsForWrappers(BigDecimal.valueOf(1234.56789), BigDecimal.valueOf(234.56789));
        BigDecimal res4;
        return res4 = gfw1.getArg1().remainder(gfw1.getArg2());
    }


    public static void main(String[] args) {
        System.out.println(result1()+"\n" + result2()+"\n" + result3() + "\n" + result4());
    }
}

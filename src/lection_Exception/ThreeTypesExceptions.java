package lection_Exception;

/* 6.	Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
          Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
*/

public class ThreeTypesExceptions {

    public static void main(String[] args) throws Exception {
        int result = 0;
        try {
            result = threeTypes(0,2);
            System.out.println(result);

        } catch (IllegalArgumentException|ArithmeticException|MyException e){
            e.printStackTrace();
            System.out.println("Enter correct arguments");
        } finally {
            System.out.println("If you get a result continue, else try again.");
        }
    }

    public static int threeTypes(int arg1, int arg2) throws MyException {
        if (arg1<0 || arg2<0) throw new IllegalArgumentException("Value of arguments is negative");
        if (arg1 == 0) throw new MyException("Value of arg1=0");
        return (arg1/arg2);

    }

}

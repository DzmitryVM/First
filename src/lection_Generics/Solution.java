package lection_Generics;

/*3.	Дан класс Solution, параметризированный T. Ограничьте параметр T.
 * T должен быть наследником класса ClassForGenerics и одновременно реализовывать
 * интерфейс InterfaceForGenerics. Менять можно только класс Solution.
 */

public class Solution <T extends ClassForGenerics> {

    public class T implements InterfaceForGenerics {
        Integer value;

        public T (Integer value) {
            this.value = value;
        }

        @ Override
        public Integer getPerimeter () {
            return value*4;
        }
    }

    private T value;

    public Solution() {}

    public Solution (T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue (T val) {
        value = val;
    }

    public String toString() {
        if (value==null) return null;
        return value.getClass().getName() + " " + value;
    }

    public static void main(String[] args) {
        Solution ob3 = new Solution();
        System.out.println(ob3.getValue());
    }
}

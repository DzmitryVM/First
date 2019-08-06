package lection03;

public class Task3_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
            System.out.print("Элементы массива в обычном порядке: ");
        for (int i=0; i < array.length; i++) {
           System.out.print(" " + array[i]);
        }
        System.out.println(" ");
            System.out.print("Элементы массива в обратном порядке: ");
        for (int i=4; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
    }
}

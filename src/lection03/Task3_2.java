package lection03;

public class Task3_2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int ind = 0;
        int j = 0;
            while (ind < 100) {                       // условие на заполнение в массив 100 чисел
                j++;
                if ((j%13==0) | (j%17==0)) {          // определяем числа, делящиеся на 13 и 17
                    array[ind] = j;                   // записываем в массив эти числа
                    ind++;
                }
            }
        System.out.println("Массив 100 чисел, делящихся на 13 и 17: ");
        for (int i=0; i < array.length; i++) {
            System.out.print("Индекс " + i + " числа: ");
            System.out.println(array[i]);
        }
    }
}

package lection03;

import java.util.Arrays;

public class Task3_3 {
    /*public static void main(String[] args) {

        char ch = ' ';
        int intCh = (int) ch;

        System.out.println("пробел corresponds with "+ intCh);
    }*/
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 9, 1, 1, 1, 0, 1, 2, 9};
        int min = getMin(array);
        int[] indexesMin = getIndexesNumberToArray(array, min);
        System.out.printf("Минимальное значение массива = %d; его индексы: %s;\n", min, Arrays.toString(indexesMin));

        int max = getMax(array);
        int[] indexesMax = getIndexesNumberToArray(array, max);
        System.out.printf("Максимальное значение массива = %d; его индексы: %s;\n", max, Arrays.toString(indexesMax)); // %d - спецификатор формата, к-й не соотв. аргументу

        sumsAllRangeBetweenMinAndMax(array, indexesMin, indexesMax);
    }

    private static int[] getIndexesNumberToArray(int[] array, int number) {
        int[] indexes = new int[0];
        if (array != null && array.length > 0) {
            indexes = new int[array.length];
            int count = 0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] == number) {
                    indexes[count++] = index;
                }
            }
            indexes = Arrays.copyOf(indexes, count);
        }
        return indexes;
    }

    private static int[] createArray(int size, int min, int max) {
        int[] array = new int[size > 0 ? size : 0];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    private static int getMin(int[] array) {
        int result = 0;
        if (array != null && array.length > 0) {
            int min = array[0];
            for (int number : array) {
                if (min > number) {
                    min = number;
                }
            }
            result = min;
        }
        return result;
    }

    private static int getMax(int[] array) {
        int result = 0;
        if (array != null && array.length > 0) {
            int max = array[0];
            for (int number : array) {
                if (max < number) {
                    max = number;
                }
            }
            result = max;
        }
        return result;
    }

    private static void sumsAllRangeBetweenMinAndMax(int[] array, int[] indexesMin, int[] indexesMax) {
        if (array != null && indexesMin != null && indexesMax != null) {
            for (int min : indexesMin) {
                for (int max : indexesMax) {
                    int start = Math.min(min, max)+1;
                    int end = Math.max(min, max)-1;
                    int sum = 0;
                    for (int index = start; index <= end; index++) {
                        System.out.print(array[index] + " ");
                        sum += array[index];
                        if (index != end) {
                            System.out.print("+ ");
                        }
                    }
                    System.out.println("= " + sum + ";");
                }
            }
        }
    }
}


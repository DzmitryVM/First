package lection_Exception;

/* 2.	Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException. */

public class OutOfBounds {
    public static void main(String[] args) {
        try {
           printArray();
       } catch (Exception e) {
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
    }

    public static int printArray () throws Exception {
        int sum = 0;
        int [] array = {1, 2 , 3};
        for (int i=0; i<4;i++) {
            sum += array[i];
        }
        return sum;
    }
}

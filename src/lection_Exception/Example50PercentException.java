package lection_Exception;

public class Example50PercentException {

    public static void main(String[] args) throws ArithmeticException{
        int[] array = {2,0,2,0,2,0,2,0};
        try {
            System.out.println("Result of arraySumDivision is " + arraySumDivision(array));
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("The array has illegal values for division.");
        } finally {
            System.out.print("Values of array: ");
            for(int j=0; j<array.length;j++){
                System.out.print(array[j]);
            }
        }
    }

    public static int arraySumDivision(int array[]){
        int sum = 0;
        for (int i=0; i<array.length-1;i++){
            sum += (array[i]/array[i+1]);
        }
        return sum;
    }
}

package lection03;

public class Task3_6 {
    public static void main(String[] args){
        int[][] arr1 = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int [][] arr2 = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        boolean equalz = TwoDequals(arr1,arr2);
        if (equalz) {
            System.out.println("массивы совпадают");
        } else {
            System.out.println("массивы не совпадают");
        }

    }

    private static boolean TwoDequals(int[][] arr1, int[][] arr2) {
        boolean eq = true;
        int i = 0;
        int j = 0;
        if ((arr1.length != arr2.length)&(arr1[0].length!=arr2[0].length)) {
            eq = false;
        } else {
            while ((eq)&(i <arr1.length)) {
                while ((eq)&(j<arr1[0].length)) {
                    if (arr1[i][j]!=arr2[i][j]) {
                        eq=false;
                    }
                    j++;
                }
                i++;
            }
        }
        return eq;}
}

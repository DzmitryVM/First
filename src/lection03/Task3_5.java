package lection03;

import com.sun.xml.internal.bind.WhiteSpaceProcessor;

public class Task3_5 {
    public static <string> void main(String[] args) {
        int arr[][]=new int[5][5];
        int i,j;

        for (i=0;i<arr.length/2+1;i++){
            for (j=0;j<arr[i].length;j++){
                if ((j<i) || (j>=(arr[i].length-i)))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;
            }
        }
        for (i=arr.length-1; i>=arr.length/2; i--){
            for (j=0; j<arr[i].length; j++){
                if ((j<(arr[i].length-1-i)) || (j>i))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;}
        }
        for (i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
        for (i=0;i<arr.length;i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                } else if (arr[i][j] == 1) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
        /*char whitespace = 32;
        char star = 42;

        for (i=arr.length-1; i>=arr.length/2; i--){
            for (j=0; j<arr[i].length; j++){
                if (arr[i][j]==0)
                    arr[i][j]= whitespace;
                else
                    arr[i][j]=star;}
        }
        for (i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }*/
}


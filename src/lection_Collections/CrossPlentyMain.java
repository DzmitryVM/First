package lection_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CrossPlentyMain {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("United set: ");
        for (int i: CrossPlenty.union(set1,set2))
            System.out.print(i+", ");
        System.out.println();
        System.out.println("Crossing set: ");
        for (int i: CrossPlenty.intersect(set1,set2))
            System.out.print(i+", ");
    }
}

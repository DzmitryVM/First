package lection_Collections;

/*3.	Вывести учеников из списка в обратном порядке. (2 варианта решения). */

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        // 1-й способ
        ArrayList<String> pupils1 = new ArrayList<>();
        pupils1.add("Сидоров");
        pupils1.add("Петров");
        pupils1.add("Иванов");

        Collections.reverse(pupils1);
        System.out.println(pupils1);

        // 2-й способ
        ArrayList<String> pupils2 = new ArrayList<>();
        pupils2.add("Сидоров");
        pupils2.add("Петров");
        pupils2.add("Иванов");

        int size = pupils2.size();
        for (int i=size-1;i>=0; i--){
            System.out.print(pupils2.get(i)+", ");
        }
    }
}


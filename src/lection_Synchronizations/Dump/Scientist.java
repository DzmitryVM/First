package lection_Synchronizations.Dump;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static lection_Synchronizations.Dump.Details.*;

public class Scientist extends Thread{
    Map<Details, Integer> compile = createMap();
    int robots;

    private static Map<Details, Integer> createMap() {
        Map<Details, Integer> myMap = new HashMap<>();
        myMap.put(RIGHT_HAND,0);
        myMap.put(RIGHT_LEG,0);
        myMap.put(LEFT_HAND,0);
        myMap.put(LEFT_LEG,0);
        myMap.put(BODY,0);
        myMap.put(HEAD,0);
        myMap.put(CPU,0);
        myMap.put(RAM,0);
        myMap.put(HDD,0);
        return myMap;
    }


    Scientist(String name){
        super(name);
    }

    @Override
    public void run() {
        while(Dump.night<100){
            Random random = new Random();
            getDetails(Dump.getDetails(random.nextInt(4)+1));
            try {
                Scientist.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int maxQuantity = compile.get(RIGHT_HAND);
        for (Map.Entry<Details, Integer> pair : compile.entrySet()) {
            if (pair.getValue() < maxQuantity) {
                maxQuantity = pair.getValue();
            }
        }
        robots = maxQuantity;
        System.out.println("После 100 ночей " + getName() + " собрал " + robots + " роботов");
    }

    public synchronized void getDetails(List<Details> list){
        for (int i = 0; i < list.size(); ++i) {
            compile.put(list.get(i),compile.get(list.get(i))+1);
        }
    }

}

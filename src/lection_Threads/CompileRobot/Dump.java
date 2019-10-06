package lection_Threads.CompileRobot;

import java.util.*;
import static lection_Threads.CompileRobot.Details.*;


public class Dump extends Thread{

    static int night = 0;
    static Map<Details, Integer> garbageDetails = createMap();

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

    Dump(){
        super("Свалка");
    }

    @Override
    public void run() {
        while(night<50){
            try {
                Thread.sleep(100);
                System.out.println("Ночь "+night);
                night++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void putDetails(List<Details> list){
        for (int i = 0; i < list.size(); ++i) {
            garbageDetails.put(list.get(i),garbageDetails.get(list.get(i))+1);
        }
    }

    public static List<Details> getDetails(int quantity){
        List<Details> list = new ArrayList<>();
        Collection<Integer> values = garbageDetails.values();
        int sum = 0;
        for (Integer val:values) {
            sum += val;
        }
        if(quantity>=sum){
            for(Map.Entry<Details,Integer> pair: garbageDetails.entrySet()){
                if (pair.getValue()>0){
                    for (int i = 0; i < pair.getValue(); ++i) {
                        list.add(pair.getKey());
                    }
                    garbageDetails.put(pair.getKey(),0);
                }
            }
        }else{
            while(quantity!=0){
                Details temp = randomDetail();
                if(garbageDetails.get(temp)!=0){
                    list.add(temp);
                    garbageDetails.put(temp,garbageDetails.get(temp)-1);
                    quantity--;
                }
            }
        }
        return list;
    }
}

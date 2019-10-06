package lection_Threads.CompileRobot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Plant extends Thread {

    Plant(){
        super("Фабрика");
    }

    @Override
    public void run() {
        Dump.putDetails(generate(20));
        try {
            Plant.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(Dump.night<50){
            Random random = new Random();
            Dump.putDetails(generate(random.nextInt(4)+1));
            try {
                Plant.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Details> generate(int quantity){
        List<Details> details = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            details.add(Details.randomDetail());
        }
        return details;
    }
}

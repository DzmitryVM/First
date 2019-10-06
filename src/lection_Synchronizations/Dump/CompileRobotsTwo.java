package lection_Synchronizations.Dump;

public class CompileRobotsTwo {
    public static void main(String[] args) throws InterruptedException {
        Scientist firstScientist = new Scientist("Прислужник ученого №1");
        Scientist secondScientist = new Scientist("Прислужник ученого №2");
        Plant plant = new Plant();
        Dump dump = new Dump();
        firstScientist.start();
        secondScientist.start();
        plant.start();
        dump.start();
        firstScientist.join();
        secondScientist.join();
        if(firstScientist.robots > secondScientist.robots){
            System.out.println("У первого ученого больше роботов.");
        }else if (firstScientist.robots == secondScientist.robots) {
            System.out.println("У обоих ученых равное количество роботов.");
        } else {
            System.out.println("У второго ученого больше роботов.");
        }
    }
}

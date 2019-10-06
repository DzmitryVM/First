package lection_Threads.CompileRobot;

public class CompileRobotRun {
    public static void main(String[] args) {
        MadScientist madScientist = new MadScientist();
        Plant plant = new Plant();
        Dump dump = new Dump();
        madScientist.start();
        plant.start();
        dump.start();
    }
}

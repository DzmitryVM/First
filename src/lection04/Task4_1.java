package lection04;

public class Task4_1 {
    public static void main(String[] args) {
        TimePeriod timeFirst = new TimePeriod("First", 5, 53, 10);
        TimePeriod timeSecond = new TimePeriod("Second", 33, 110, 95);
        TimePeriod timeThird = new TimePeriod("Third", 21190);
        TimePeriod timeFourth = new TimePeriod("Fourth", 35435);

        printTimePeriod(timeFirst);
        printTimePeriod(timeSecond);
        printTimePeriod(timeThird);
        printTimePeriod(timeFourth);

    }

    public static void printTimePeriod(TimePeriod time) {               // вывод поочередно:
        System.out.println("Name _" + time.getName() + "_:");           // имя объекта,
        System.out.println("seconds = " + time.secondsQuantity());      // время, пересчитанное в секунды,
        System.out.println("time =    " + time);                        // по отдельности часы, минуты, секунды
    }
}

class TimePeriod {
    private String name;
    private int hours;
    private int minutes;
    private int seconds;

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public TimePeriod(String name, int hours, int minutes, int seconds) {  // метод "отсечения превышающих значений"
        this.name = name;                                      // для 1-го и 2-го объектов
        this.hours = Math.abs(hours) % 24;                     // перевод в формат 24-часовых суток
        this.minutes = Math.abs(minutes) % 60;                 // в формат 60мин в часе
        this.seconds = Math.abs(seconds) % 60;                 // в формат 60сек в минуте
    }

    public TimePeriod(String name, int seconds) {               // метод для 3-го и 4-го объектов
        this.name = name;
        convertSecondsToTime(seconds);
    }

    public int secondsQuantity() {                               // метод определения общего кол-ва секунд в объекте
        return this.hours * 3600 + this.minutes * 60 + seconds;
    }

    private void convertSecondsToTime(int seconds) {             // метод определения времени (час,мин,сек) из секунд
        seconds = Math.abs(seconds);
        this.hours = seconds / 3600;                        // расчет часов и т.д.
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    @Override
    public String toString() {                                   // выводим итог пересчета из секунд в час, мин,сек
        return String.format("%d h. %d m. %d s", this.hours, this.minutes, this.seconds);
    }

}
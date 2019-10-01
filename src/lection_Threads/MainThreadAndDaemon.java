package lection_Threads;

/* 1.	Создать поток, который будет в цикле итерироваться от 1 до 10 000 000 и суммировать каждый
* четный элемент кратный 3. На каждой итерации, кратной 1 000 000, поток должен заснуть на 10мс.
* Вместе с суммирующим потоком запустить поток демон, который каждую пятую миллисекунду выводит
* в консоль текущее значение просуммированных элементов.*/

public class MainThreadAndDaemon implements Runnable{

    Thread t;
    static long sum = 0;
    public void run(){
        System.out.println(Thread.currentThread().getName() + " starts.");
        for (int i=1; i<10000000; i++) {
            if (i%2==0 && i%3==0){
                sum+=i;
            }
            if(i%1000000==0) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+" " + sum);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Main thread starts.");
        Thread t = new Thread(new MainThreadAndDaemon());
        t.start();

        /*Thread t2 = new Thread(new MainThreadAndDaemon());  // доп. поток для тестов
        t2.setDaemon(true);
        t2.start();*/
        new MyDaemon();
        System.out.println("Main thread finished");
    }
}

package lection_Synchronizations.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomersQuantity extends Thread{
    @Override
    public void run () {
        List<Customer> customers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Магазин открывается.");
        int num = 1;
        Customer.customersToday = random.nextInt(10)+10;
        while (num<=Customer.customersToday) {
            customers.add(new Customer(num));
            customers.get(customers.size()-1).start();
            ++num;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Двери магазина закрываются (покупателей только выпускают).");

    }
}

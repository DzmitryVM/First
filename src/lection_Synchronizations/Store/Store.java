package lection_Synchronizations.Store;

public class Store {
    public static void main(String[] args) {
        Cashbox cashbox1 = new Cashbox(1);
        Cashbox cashbox2 = new Cashbox(2);
        Cashbox cashbox3 = new Cashbox(3);
        cashbox1.start();
        cashbox2.start();
        cashbox3.start();
        CustomersQuantity createCustomer = new CustomersQuantity();
        createCustomer.start();
    }
}

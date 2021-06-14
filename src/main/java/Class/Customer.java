package Class;

import Interface.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    //constructor
    public Customer(String name, double initial_transactions) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initial_transactions);
    }

    //Methods
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
}

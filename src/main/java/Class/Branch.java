package Class;

import Interface.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;

    //constructor
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    //Methods
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name_of_Customer, double initial_transaction) {
        if (findCustomer(name_of_Customer) == null){
            this.customers.add(new Customer(name_of_Customer, initial_transaction));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name_of_Customer, double transaction) {
        Customer existingCustomer = findCustomer(name_of_Customer);
        if (existingCustomer != null){
            existingCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String name_of_Customer) {
        for ( int i=0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name_of_Customer)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}

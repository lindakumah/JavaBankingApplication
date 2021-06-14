package Interface;
import Class.Branch;
import Class.Customer;

import java.util.ArrayList;

public interface IBranch {
    public String getName();
    public ArrayList<Customer> getCustomers();
    public boolean newCustomer(String name_of_Customer, double initial_transaction);
    public boolean addCustomerTransaction(String name_of_Customer, double transaction);
}

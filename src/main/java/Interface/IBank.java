package Interface;
import Class.Branch;

public interface IBank {
    public boolean addBranch(String name_of_Branch);
    public boolean addCustomer(String name_of_Branch, String name_of_Customer, double initial_transaction);
    public boolean addCustomerTransaction(String name_of_branch, String name_of_Customer, double transaction);
    public boolean listCustomers(String name_of_Branch, boolean print_transactions);
}

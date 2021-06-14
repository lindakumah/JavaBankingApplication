package Class;

import Interface.IBank;

import java.util.ArrayList;

public class Bank implements IBank {
    private String name;
    private ArrayList<Branch> branches;

    //constructor
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    //Methods
    public boolean addBranch(String name_of_Branch) {
        if (findBranch(name_of_Branch) == null) {
            this.branches.add(new Branch(name_of_Branch));
            return true;
        } else {
            return false;
        }
    }
    public boolean addCustomer(String name_of_Branch, String name_of_Customer, double initial_transaction) {
        Branch branch = findBranch(name_of_Branch);
        if (branch!=null) {
            return branch.newCustomer(name_of_Customer, initial_transaction);
        } else {
            return false;
        }
    }
    public boolean addCustomerTransaction(String name_of_branch, String name_of_Customer, double transaction) {
        Branch branch = findBranch(name_of_branch);
        if (branch!=null) {
            return branch.addCustomerTransaction(name_of_Customer,transaction);
        } else {
            return false;
        }
    }
    private Branch findBranch(String name_of_Branch) {
        for (int i=0; i<this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(name_of_Branch)){
                return checkedBranch;
            }
        }
        return null;

    }
    public boolean listCustomers(String name_of_Branch, boolean print_transactions) {
        Branch branch = findBranch(name_of_Branch);
        if (branch != null) {
            System.out.println("Customer details for branch" + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (print_transactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] amount" + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}



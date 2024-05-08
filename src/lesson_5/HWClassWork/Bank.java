package lesson_5.HWClassWork;

import java.util.ArrayList;

public class Bank {

    private String title;
    private TransactionsList transactionsList = new TransactionsList();
    private ArrayList<bankAccount> bankAccounts = new ArrayList<>();

    public Bank(String title) {
        this.title = title;
    }

    private String accountsToString() {
        String res = "";
        for (int i = 0; i < bankAccounts.size(); i++) {
            res += bankAccounts.get(i) + "\n";
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    public bankAccount getAccountByUsersLastName(String lastName){
        for (bankAccount accounts : bankAccounts) {
            if (accounts.getUser().getLastName().equals(lastName)) {
                return accounts;
            }
        }
        return null;
    }
    // или так
//    public BankAccount getAccountByUsersLastName(String lastName) {
//        for (int i = 0; i < bankAccounts.size(); i++) {
//            BankAccount account = bankAccounts.get(i);
//            if (account.getUser().getLastName().equals(lastName)) {
//                return account;
//            }
//        }
//        return null;
//    }

    public void depositAccountUserLastName(String lastName, double amount){
        bankAccount account = getAccountByUsersLastName(lastName);
        if (account != null){
            account.deposit(amount);
        }
    }public void withDrawAccountUserLastName(String lastName, double amount){
        bankAccount account = getAccountByUsersLastName(lastName);
        if (account != null){
            account.withDraw(amount);
        }
    }

    public boolean transfer(String lastNameFrom, String lastNameTo, double amount){

        bankAccount accountFrom =  getAccountByUsersLastName(lastNameFrom);
        bankAccount accountTo = getAccountByUsersLastName(lastNameTo);
        if (accountFrom == null || accountTo == null){
            return false;
        }
        if (accountFrom.withDraw(amount)){
            accountTo.deposit(amount);
            transactionsList.addTransaction(new Transaction(accountFrom,accountTo,amount));
            return true;
        }
            return false;
    }

    public TransactionsList getTransactionsArray() {
        return transactionsList;
    }

    public void addNewAccount(bankAccount account){
        bankAccounts.add(account);
    }

    @Override
    public String toString() {
        return  "Bank: " + title + "\nВсего счетов: " + bankAccounts.size() + "\nСчета:\n"
        + accountsToString();

    }
}

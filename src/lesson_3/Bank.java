package lesson_3;

import java.util.ArrayList;

public class Bank {
//    private int capacity = 6;
    private String title;
//    private bankAccount[] bankAccounts = new bankAccount[capacity];
    private int size;
    private TransactionsArray transactionsArray = new TransactionsArray();
    private ArrayList<bankAccount> bankAccounts;

    public Bank(String title) {
        this.title = title;
//        this.array = array;
//        size = 0;
//        addNewAccount(array);
        this.bankAccounts = new ArrayList<>();
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
            transactionsArray.addTransaction(new Transaction(accountFrom,accountTo,amount));
            return true;
        }
            return false;
    }

    public TransactionsArray getTransactionsArray() {
        return transactionsArray;
    }

//    private void addNewAccount(bankAccount[] array) {
//        for (int i = 0; i < array.length; i++){
//            addNewAccount(array[i]);
//        }
//    }

//    public void addNewAccount(bankAccount account){
//        if (size >= bankAccounts.length){
//            enlarge();
//        }
//        bankAccounts[size++] = account;
//    }
    public void addNewAccount(bankAccount account){
        bankAccounts.add(account);
    }
//    private void enlarge() {
//        bankAccount[] temp = new bankAccount[bankAccounts.length * 2];
//        for (int i = 0; i < bankAccounts.length; i++) {
//            temp[i] = bankAccounts[i];
//        }
//        bankAccounts = temp;
//    }

    @Override
    public String toString() {
        return  "Bank: " + title + "Всего счетов: " + bankAccounts.size() + "\n Счета:\n"
        + accountsToString();

    }
}

package lesson_2;

import java.util.Arrays;

public class Bank {
    private String title;
    private bankAccount[] bankAccounts;

    public Bank(String title, bankAccount[] bankAccounts) {
        this.title = title;
        this.bankAccounts = bankAccounts;
    }

    private String accountsToString() {
        String res = "";
        for (int i = 0; i < bankAccounts.length; i++) {
            res += bankAccounts[i] + "\n";
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    public bankAccount getAccountByUsersLastName(String lastName){
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i].getUser().getLastName().equals(lastName)) {
                return bankAccounts[i];
            }
        }
        return null;
    }

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

    @Override
    public String toString() {
        return  "Bank: " + title + "\n Счета:\n"
        + accountsToString();

    }
}

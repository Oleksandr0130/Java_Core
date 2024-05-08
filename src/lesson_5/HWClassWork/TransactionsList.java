package lesson_5.HWClassWork;

import java.util.ArrayList;

public class TransactionsList {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }


    public String toString() {
        String res = "";
        for (int i = 0; i < transactions.size(); i++) {
            res += transactions.get(i).toString() + "\n";
        }
        return res;
    }
}

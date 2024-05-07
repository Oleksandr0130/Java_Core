package lesson_3;

import java.util.ArrayList;

public class TransactionsArray {
//    private int capacity = 6;
//    private  int size = 0;
//    private Transaction[] transactions = new Transaction[capacity];
    private ArrayList<Transaction> transactions;

    public TransactionsArray() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    //    public void addTransaction(Transaction transaction){
//        if (size >= transactions.length){
//            enlarge();
//        }
//        transactions[size++]= transaction;
//    }
//    private void enlarge() {
//        Transaction[] temp = new Transaction[transactions.length * 2];
//        for (int i = 0; i < transactions.length; i++) {
//            temp[i] = transactions[i];
//        }
//        transactions = temp;
//    }

    public String toString() {
        String res = "";
        for (int i = 0; i < transactions.size(); i++) {
            res += transactions.get(i).toString() + "\n";
        }
        return res;
    }
}

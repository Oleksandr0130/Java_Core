package lesson_3;

public class TransactionsArray {
    private int capacity = 6;
    private  int size = 0;
    private Transaction[] transactions = new Transaction[capacity];

    public void addTransaction(Transaction transaction){
        if (size >= transactions.length){
            enlarge();
        }
        transactions[size++]= transaction;
    }
    private void enlarge() {
        Transaction[] temp = new Transaction[transactions.length * 2];
        for (int i = 0; i < transactions.length; i++) {
            temp[i] = transactions[i];
        }
        transactions = temp;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += transactions[i] + "\n";
        }
        return res;
    }
}

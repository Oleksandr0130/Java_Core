package lesson_5.HWClassWork;

public class Transaction {
    private bankAccount from;
    private bankAccount to;
    double amount;

    public Transaction(bankAccount from, bankAccount to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "from : " + from +
                ", to : " + to +
                ", amount : " + amount;
    }
}

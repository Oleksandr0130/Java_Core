package lesson_05.HWClassWork;

public class bankAccount {
    private String iban;
    private double balance;
    private Person user;

    public bankAccount(String iban, Person user) {
        this.iban = iban;
        this.user = user;
        balance = 0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    boolean withDraw(double amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public Person getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "iban='" + iban + '\'' +
                ", [" + balance + "]"+
                "," + user +
                '}';
    }
}

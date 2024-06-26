package lesson_27.HomeWork;

public class BankAccount {
    private Person person;
    private String iban;
    private double balance;

    public BankAccount(Person person, String iban, double balance) {
        this.person = person;
        this.iban = iban;
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}

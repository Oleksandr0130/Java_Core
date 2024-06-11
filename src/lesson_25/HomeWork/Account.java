package lesson_25.HomeWork;

public class Account {
    String iban;
    Person owner;

    public Account(String iban, Person owner) {
        this.iban = iban;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "[iban: " + iban + "] -> " +
                "owner: " + owner;
    }
}

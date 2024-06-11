package lesson_26.HW25.Task1;

import java.util.Objects;

public class Account {
    String iban;
    Person owner;

    public Account(String iban, Person owner) {
        this.iban = iban;
        this.owner = owner;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban) && Objects.equals(owner, account.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, owner);
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", owner=" + owner +
                '}';
    }
}

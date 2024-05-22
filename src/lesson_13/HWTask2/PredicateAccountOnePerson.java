package lesson_13.HWTask2;

public class PredicateAccountOnePerson implements AccountPredicate{
    Person owner;

    public PredicateAccountOnePerson(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean test(Account account) {
        return account.getOwner().equals(owner);
    }
}

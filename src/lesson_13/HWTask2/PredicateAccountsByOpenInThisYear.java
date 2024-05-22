package lesson_13.HWTask2;

public class PredicateAccountsByOpenInThisYear implements AccountPredicate{
    private int year;

    public PredicateAccountsByOpenInThisYear(int year) {
        this.year = year;
    }

    @Override
    public boolean test(Account account) {
        return account.getOpenDate().getYear() == year;
    }
}

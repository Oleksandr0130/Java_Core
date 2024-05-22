package lesson_13.HWTask2;

public class PredicateAccountsByLimit implements AccountPredicate{
    double limitBalance;

    public PredicateAccountsByLimit(double limitBalance) {
        this.limitBalance = limitBalance;
    }

    @Override
    public boolean test(Account account) {
        return account.getBalance() > limitBalance;
    }
}

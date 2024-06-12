package lesson_27.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(new Person("John", 26),"iBan1",150));
        accounts.add(new BankAccount(new Person("Jack", 38),"iBan2",50));
        accounts.add(new BankAccount(new Person("Anna", 15),"iBan3",85.50));
        accounts.add(new BankAccount(new Person("Andrey", 21),"iBan4",185.50));
        accounts.add(new BankAccount(new Person("Tom", 12),"iBan5",100));

        System.out.println("====список всех клиентов====");
        List<Person> getAllPerson = universalMethod(accounts, bankAccount -> bankAccount,bankAccount -> true,BankAccount::getPerson);
        System.out.println(getAllPerson + "\n");

        System.out.println("====список клиентов, чей баланс меньше 100====");
        List<Person> getBalanceThan100 = universalMethod(accounts,BankAccount::getBalance,balance -> balance < 100,BankAccount::getPerson);
        System.out.println(getBalanceThan100 + "\n");

        System.out.println("====список всех IBAN====");
        List<String> getAlliBan = universalMethod(accounts,bankAccount -> bankAccount,bankAccount -> true,BankAccount::getIban);
        System.out.println(getAlliBan + "\n");

        System.out.println("==== список всех IBAN, клиентов младше 16 лет====");
        List<String> getIbanForClientUnder16 = universalMethod(accounts,bankAccount -> bankAccount.getPerson().getAge(),age -> age < 16,BankAccount::getIban);
        System.out.println(getIbanForClientUnder16);
    }
    public static <R, T>List <R> universalMethod(
        List<BankAccount> accounts,
        Function<BankAccount, T> tFunction,
        Predicate<T> filter,
        Function<BankAccount, R> transformer
    ){
        List<R>result = new ArrayList<>();
        for (BankAccount account : accounts){
            T value = tFunction.apply(account);
            if (filter.test(value)){
                result.add(transformer.apply(account));
            }
        }
        return result;
    }
}

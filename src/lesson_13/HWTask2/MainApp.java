package lesson_13.HWTask2;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Account> accounts = List.of(
                new Account("DE0001", 1000.50, new Person("Jack", 20), new MyDate(10, 5, 2024)),
                new Account("DE0002", 8732.55, new Person("John", 28), new MyDate(1, 3, 2023)),
                new Account("DE0003", 7640.40, new Person("Bob", 23), new MyDate(19, 2, 2016)),
                new Account("DE0003", 140.40, new Person("Bob", 23), new MyDate(12, 4, 2019)),
                new Account("DE0004", 3800.01, new Person("Tom", 10), new MyDate(25, 1, 2012)),
                new Account("DE0005", 100.50, new Person("Alice", 16), new MyDate(15, 9, 2022)),
                new Account("DE0005", 100.50, new Person("Alice", 16), new MyDate(15, 9, 2022)),
                new Account("DE0003", 17640.40, new Person("Bob", 23), new MyDate(20, 6, 2020)),
                new Account("DE0006", 300012.50, new Person("Nick", 32), new MyDate(12, 7, 2018))
        );
        printAccounts(accounts);
        System.out.println("================LIMIT=================");
        printAccounts(filterAccounts(accounts,new PredicateAccountsByLimit(1500)));
        System.out.println("================One Person=================");
        printAccounts(filterAccounts(accounts,new PredicateAccountOnePerson(new Person("Bob", 23))));
        printAccounts(filterAccounts(accounts,new PredicateAccountOnePerson(new Person("Alice", 16))));
        System.out.println("================By Year=================");
        printAccounts(filterAccounts(accounts,new PredicateAccountsByOpenInThisYear(2016)));
        System.out.println("=================By Owner Name================");
        printAccounts(filterAccounts(accounts, new PredicateAccountsByOwnerName("Bob")));
        System.out.println("================By Age=================");
        printAccounts(filterAccounts(accounts,new PredicateAccountsByAge(15)));

    }

    public static void printAccounts(List<Account> accounts){
        for (Account account : accounts){
            System.out.println(account);
        }
    }

    public static List<Account> filterAccounts (List<Account> list, AccountPredicate predicate){
        List<Account> result = new ArrayList<>();
        //перебираем
        for (Account account : list){
            //отбор элементов, условие
            if (predicate.test(account)){
                result.add(account);
            }
        }
        return result;
    }
}

package lesson_25.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class AccountApp {
    public static void main(String[] args) {
        Person Jack = new Person("Jack");
        Person Ann = new Person("Ann");

        Account JackAccount = new Account("1111", Jack);
        Account AnnAccount = new Account("1112", Ann);

        Map<Person,Account> accountMap = new HashMap<>();
        accountMap.put(Ann, JackAccount);
        accountMap.put(Jack, AnnAccount);

        for (Map.Entry<Person, Account> entry : accountMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        correctAccounts(accountMap);
    }

    public static void correctAccounts(Map<Person, Account> accountMap){
        Map<Person,Account> personAccountMap = new HashMap<>();
        for (Map.Entry<Person, Account> entry : accountMap.entrySet()){
            Person currentKey = entry.getKey();
            Account currentAccount = entry.getValue();

            if (!currentKey.equals(currentAccount.owner)){
                personAccountMap.put(currentAccount.owner,currentAccount);
            }else {
                personAccountMap.put(currentKey,currentAccount);
            }
        }
        accountMap.clear();
        accountMap.putAll(personAccountMap);
    }
}

package lesson_26.HW25.Task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class PersonApp {
    public static void main(String[] args) {

    }
    public static Map<Person, Account> reMapPersonToAccount(Map<Person,Account> map){
        Map<Person,Account> result = new HashMap<>();
        for (var account : new HashSet<>(map.values())){
            result.put(account.getOwner(),account);
        }
        return result;
    }

    public static void fixErrorInMap(Map<Person,Account> map){
        HashSet<Account> errors = new HashSet<>();
        Iterator<Map.Entry<Person, Account>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Person, Account> entry = iterator.next();
            Person key = entry.getKey();
            Account account = entry.getValue();

            if (!key.equals(account.getOwner())){
                errors.add(account);
                iterator.remove();
            }
        }
        for (Account acc : errors){
            map.put(acc.getOwner(),acc);
        }
    }
}

package lesson_26.HW25.Task2;

import lesson_26.HW25.Task1.Account;
import lesson_26.HW25.Task1.Person;

import java.util.*;

public class PersonApp2 {
    public static void main(String[] args) {

    }

    public static void fixMap(Map<Person, List<Account>> map){
        Map<Person,List<Account>> errorsMap = new HashMap<>();
        for (var entry : map.entrySet()){
            Person key = entry.getKey();
            List<Account> value = entry.getValue();
            Iterator<Account> iterator = value.iterator();
            while (iterator.hasNext()){
                Account account = iterator.next();
                if (!key.equals(account.getOwner())){
                    iterator.remove();
                    if (map.containsKey(account.getOwner())){
                        map.get(account.getOwner()).add(account);
                    } else {
                        List<Account> list = errorsMap.getOrDefault(account.getOwner(), new ArrayList<>());
                        list.add(account);
                        errorsMap.put(account.getOwner(),list);
                    }
                }
            }
        }
            for (var entry : errorsMap.entrySet()){
                map.put(entry.getKey(), entry.getValue());

            }
    }
}

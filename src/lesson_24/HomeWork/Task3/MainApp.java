package lesson_24.HomeWork.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {

    }

    public static Map<Person, List<String>> mapOwnerAccounts(List<Account> accounts){
        Map<Person, List<String>> result = new HashMap<>();
        for (Account acc : accounts){
            Person owner = acc.getOwner();
            List<String> list = result.get(owner);
            if (list == null){
                list = new ArrayList<>();
                result.put(owner,list);
            }
            list.add(acc.getIban());
        }
        return result;
    }
}

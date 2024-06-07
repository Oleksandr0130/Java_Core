package lesson_23.Task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserApp {
    static Set<String> set = null;

    public static void main(String[] args) {

    }

    public static void initSet(List<User> list) {
        set = new HashSet<>();
        for (User user : list) {
            set.add(user.getNickName());
            set.add(user.getEmail());
        }
        set.add("");
    }

    public static boolean isUserOk(List<User> list, User userToCheck) {
        if (set == null){
            initSet(list);
        }
        if (set.contains(userToCheck.getEmail()) || set.contains(userToCheck.getNickName())){
            return false;
        }else {
            return true;
        }
    }
}


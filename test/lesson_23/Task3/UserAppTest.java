package lesson_23.Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserAppTest {

    @Test
    void isUserOk() {
        List<User> users = List.of(
                new User("john", "john_sobaka@mail.com"),
                new User("gena", "crocodail@mail.com"),
                new User("tom", "cat@mail.com"),
                new User("jerry", "mause@mail.com"),
                new User("bob", "bobik@mail.com")
        );
        Assertions.assertAll(
                ()-> assertFalse(UserApp.isUserOk(users,new User("tom", "catty@mail.com")), "nickName exists test"),
                ()-> assertFalse(UserApp.isUserOk(users,new User("sam", "mause@mail.com")),"email exist test"),
                ()-> assertTrue(UserApp.isUserOk(users,new User("tommy", "lee@mail.com")),"all is ok test"),
                ()-> assertFalse(UserApp.isUserOk(users,new User("", "catty@mail.com")),"empty nickName test"),
                ()-> assertFalse(UserApp.isUserOk(users,new User("Hacker", "")), "empty email test")

        );
    }
}
package lesson_23.Task3;

import java.util.Objects;

public class User {
    private String nickName;
    private String email;

    public User(String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nickName, user.nickName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, email);
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nickName + " (" + email + ")";
    }
}

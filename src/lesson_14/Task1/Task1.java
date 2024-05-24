package lesson_14.Task1;
/*
Дана строка следующего вида:
Ivan Ivanov;Oleg Petrov;Anna Kovaleva
т.е. строка представляет список имен и фамилий разделенный точкой с запятой.
Ваша задача написать метод который формирует строку вида:
I.Ivanov;O.Petrov;A.Kovaleva

Подсказка:
обратите внимание на метод split() у класса String. C его помощью вы, например, легко можете получить массив строк, где каждая строка имеет вид  “Ivan Ivanov”
Следующий шаг: каждую строку вида “Ivan Ivanov” превратить в строку вида   I.Ivanov Тут тот же split() может помочь.
 Также могут оказаться полезными другие методы класса String: charAt(), substring(),indexOf()
Теперь все получившиеся строки нужно склеить в одну, естественно, используя StringBuilder

 */

public class Task1 {
    public static void main(String[] args) {
        String list = "Ivan Ivanov;Oleg Petrov;Anna Kovaleva";

        System.out.println(nameString(list));
    }

    public static String nameString(String list){
        String[] names = list.split(";");

        StringBuilder sb = new StringBuilder();

        for (String name : names){
            String[] firstLastName = name.split(" ");
            if (firstLastName.length == 2){
                char n = firstLastName[0].charAt(0);
                String lastName = firstLastName[1];

                sb.append(n).append(".").append(lastName).append(";");
            }
        }
        if(sb.length() > 0){
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}

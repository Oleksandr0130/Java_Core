package lesson_22.ClassWork;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Nick Jack and John");
        for (String str : text){
            System.out.println(str);
        }

        Iterator<String> iterator = text.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("a")){
            iterator.remove();
            }
        }
        System.out.println(text);
    }
}

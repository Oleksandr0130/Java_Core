package lesson_22;

import java.util.Iterator;
import java.util.List;

public class MainHw {
    public static void main(String[] args) {

    }
    public static void removeByIterator(List<String> list, String prefix){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith(prefix)){
                iterator.remove();
            }
        }
    }
}

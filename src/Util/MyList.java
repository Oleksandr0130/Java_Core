package Util;

public interface MyList<T> {
    boolean add (T element);
    boolean add (int index, T element);
    T get(int index);
    int size();
    T removeFirstElement();
    T removeLastElement();
    T remove(int index);
    T set(int index, T element);
}

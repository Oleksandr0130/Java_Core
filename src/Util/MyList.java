package Util;

public interface MyList<T> extends Iterable {
    boolean add (T element);
    boolean addFisrtorMiddleorLast (int index, T element);
    boolean addAfterRemoving (int index, T element);
    T get(int index);
    int size();
    T removeFirstElement();
    T removeLastElement();
    T remove(int index);
    T set(int index, T element);
}

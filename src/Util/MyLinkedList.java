package Util;

public class MyLinkedList<T> implements MyList<T>{
    private Node<T> first = null;
    private Node<T> last = null;
    private int size = 0;

    @Override
    public boolean add(T element) {
        Node<T> node = new Node<>(last, null, element);
        size++;
        if (last != null){
            last.setNext(node);
        }
        if (first == null){
            first = node;
        }
            last = node;
        return true;
    }

    @Override
    public boolean add(int index, T element) {
        if (index == 0) {
            Node<T> newNode = new Node<>(null, first, element);
            first.setPrev(newNode);
            first = newNode;
        } else if (index == size) {
            Node<T> newNode = new Node<>(last, null, element);
            last.setNext(newNode);
            last = newNode;
        } else {
            Node<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            Node<T> newNode = new Node<>(current.getPrev(), current, element);
            current.getPrev().setNext(newNode);
            current.setPrev(newNode);
        }

        size++;
        return true;
    }

    @Override
    public T get(int index) {
        Node<T> node = getNode(index);
        return (node != null)? node.getValue():null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirstElement() {
        return remove(first);
//      if (size == 0) {
//          return null;
//      }
//      String removedValue = first.getValue();
//      if (size == 1) {
//          first = null;
//          last = null;
//      }else {
//          first = first.getNext();
//          first.setPrev(null);
//      }
//      size--;
//      return removedValue;
    }

    public T removeLastElement(){
        return remove(last);
//        if (size == 0){
//            return null;
//        }
//        String removedValue1 = last.getValue();
//        if (size == 1) {
//            first = null;
//            last = null;
//        } else {
//            last = last.getPrev();
//            last.setNext(null);
//        }
//        size--;
//        return removedValue1;
    }

    @Override
    public T remove(int index) {
        Node<T> node = getNode(index);
        return remove(node);
    }

    private T remove (Node<T> node){
        if (node == null){
            return null;
        }
        Node<T> prev = node.getPrev();
        Node<T> next = node.getNext();
        if (prev != null){
            prev.setNext(next);
        }else {
            first = next;
        }
        if (next != null){
            next.setPrev(prev);
        }else {
            last = prev;
        }
        size--;
        node.setPrev(null);
        node.setNext(null);
        T removedValue = node.getValue();
        return removedValue;
    }

    private Node<T> getNode(int index){
        if (index < 0 || index >= size || first == null){

            return null;
        }
        int counter = 0;
        Node<T> aktiveNode = first;
        while (aktiveNode != null && counter < index){
            aktiveNode = aktiveNode.getNext();
            counter++;
        }
        return aktiveNode;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public String toString() {
        if (first == null){
            return "MyLinkedList []";
        }
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = first;
        while (currentNode!=null){
        sb.append(currentNode.getValue()).append(";");
            currentNode = currentNode.getNext();
        }
        sb.setLength(sb.length() - 1);
        return "MyLinkedList [" + sb.toString() + ']';
    }
}

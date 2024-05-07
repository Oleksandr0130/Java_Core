package lesson_4;

import java.util.Arrays;

public class IntArrayHandler {
    private int capacity = 6;
    private int size = 0;
    private int[] array = new int[capacity];

    public void add(int element){
        if (size >= array.length){
            enlarge();
        }
        array[size++] = element;
    }

    private void enlarge() {
        /*int[] temp = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    */
        array = Arrays.copyOf(array, array.length * 2);
    }


    public int get(int index) {
        return array[index];
    }

    public long sum(){
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public String toString() {
//        String res = "";
//        for (int i = 0; i < size; i++) {
//            res +="[" + i + "]= " + array[i] + " ;";
//        }
//        return res;
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}

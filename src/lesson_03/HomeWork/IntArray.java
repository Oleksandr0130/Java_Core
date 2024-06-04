package lesson_03.HomeWork;


import java.util.Arrays;

/*
Реализовать класс IntArrayHandler, который "управляет" массивом int.
Т.е. внутри должен быть массив int[].
Реализуйте метод add(int) который позволит добавить элемент,
метод toString(), метод sum(),
который посчитает сумму элементов и метод get(int index) -
который возвращает элемент по индексу. Естественно,
массив должен быть "резиновый".
Реализуйте в вашей программе возможность вводить числа с клавиатуры.
Если пользователь ввел 0 - программа завершается.
 */
public class IntArray {
    private int[] array;
    private int size;

    public IntArray() {
        array = new int[10];
        size = 0;
    }


    public void add(int value) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = value;
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return 0;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}

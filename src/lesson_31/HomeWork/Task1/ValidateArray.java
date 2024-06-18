package lesson_31.HomeWork.Task1;
/*
Допустим, Ваш метод должен получить массив int размером 10x10 элементов.
Необходимо, что бы ваш метод бросал IllegalArgumentException
если размер переданного массива некорректен или вместо массива пришел null.

 */
public class ValidateArray {
    public static void main(String[] args) {
        int[][] validArray = new int[10][10];
        int[][] invalidArray = new int[5][10]; // Неправильный размер строки
        int[][] nullArray = null; // Массив равен null
        int[][] invalidColumnsArray = new int[10][5]; // Неправильное количество столбцов

        testArray(validArray);
        testArray(invalidArray);
        testArray(nullArray);
        testArray(invalidColumnsArray);
    }

    public static void validateArray(int[][] array) {
        try {
            if (array == null) {
                throw new ArrayIsNull();
            }
            if (array.length != 10) {
                throw new ArrayMustHave10Rows();
            }

            for (int[] row : array) {
                if (row == null || row.length != 10) {
                    throw new EachRowMustHave10Columns();
                }
            }
            System.out.println("Array is valid");
        } catch (ArrayIsNull | ArrayMustHave10Rows | EachRowMustHave10Columns e) {
            System.out.println(e.getMessage());
        }
    }

    private static void testArray(int[][] array) {
            validateArray(array);
    }
}


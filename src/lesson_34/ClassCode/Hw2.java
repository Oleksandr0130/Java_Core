package lesson_34.ClassCode;

import java.io.*;

public class Hw2 {
    public static void main(String[] args) {
        String inputFile = "D:/333/file.dat";

        int[] filesSize = {601, 57053, 22494};
        File inputData = new File(inputFile);
        if (!inputData.exists()) {
            System.out.println("Отсутствует файл данных");
            System.exit(-1);
        }
        int sizeAll = filesSize[0] + filesSize[1] + filesSize[2];
        System.out.println(inputData.length());
        if (inputData.length() < sizeAll) {
            System.out.println("Не верный формат файла данных");
            System.exit(-1);
        }


        String[] outputFiles = {
                "D:/333/file1",
                "D:/333/file2",
                "D:/333/file3"
        };


        try (FileInputStream inputStream = new FileInputStream(inputFile);) {

            for (int i = 0; i < 3; i++) {
                readPart(filesSize, outputFiles, inputStream, i);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
    }

    private static void readPart(int[] filesSize, String[] outputFiles, FileInputStream inputStream, int index) {
        try (OutputStream os = new FileOutputStream(outputFiles[index])) {
            byte[] buffer = new byte[filesSize[index]];
            int bytes = inputStream.read(buffer);
            if (bytes == filesSize[index]) {
                os.write(buffer, 0, bytes);
            } else {
                System.out.println("Ошибка чтения [" + (index + 1) + "] части");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи [" + (index + 1) + "] части");
        }
    }
}

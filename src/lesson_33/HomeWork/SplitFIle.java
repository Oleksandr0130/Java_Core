package lesson_33.HomeWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFIle {
    public static void main(String[] args) {

        String inputFilePath = "input.dat";

        String outputFilePath1 = "part1.dat";
        String outputFilePath2 = "part2.dat";
        String outputFilePath3 = "part3.dat";

        int part1Size = 601;
        int part2Size = 57053;
        int part3Size = 22494;

        try (
                FileInputStream inputStream = new FileInputStream(inputFilePath);
                FileOutputStream outputStream1 = new FileOutputStream(outputFilePath1);
                FileOutputStream outputStream2 = new FileOutputStream(outputFilePath2);
                FileOutputStream outputStream3 = new FileOutputStream(outputFilePath3)
        ) {

            byte[] buffer = new byte[part1Size];
            int bytesRead = inputStream.read(buffer);
            if (bytesRead != -1) {
                outputStream1.write(buffer, 0, bytesRead);
            }

            buffer = new byte[part2Size];
            bytesRead = inputStream.read(buffer);
            if (bytesRead != -1) {
                outputStream2.write(buffer, 0, bytesRead);
            }

            buffer = new byte[part3Size];
            bytesRead = inputStream.read(buffer);
            if (bytesRead != -1) {
                outputStream3.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

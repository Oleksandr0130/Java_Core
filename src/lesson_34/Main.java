package lesson_34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Ваша программа  должна записать в отдельный файл первые 601 байт,
затем в отдельный файл записать следующие 57053 байта и оставшиеся 22494 байта записать в следующий файл.
Если все сделано правильно, у вас должно получиться 3 файла.
 */
public class Main {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\olek1\\Downloads\\file.dat";

        String outputFile1 = "D:\\123\\file1.dat";
        String outputFile2 = "D:\\123\\file2.dat";
        String outputFile3 = "D:\\123\\file3.dat";

        int file1Size = 601;
        int file2Size = 57053;
        int file3Size = 22494;

        try (
                FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream1 = new FileOutputStream(outputFile1);
                FileOutputStream outputStream2 = new FileOutputStream(outputFile2);
                FileOutputStream outputStream3 = new FileOutputStream(outputFile3)
        ){
            byte[] buffer = new byte[file1Size];
            int bytes = inputStream.read(buffer);
            if (bytes != -1){
                outputStream1.write(buffer,0,bytes);
            }

            buffer = new byte[file2Size];
            bytes = inputStream.read(buffer);
            if (bytes != -1){
                outputStream2.write(buffer,0,bytes);
            }

            buffer = new byte[file3Size];
            bytes = inputStream.read(buffer);
            if (bytes != -1){
                outputStream3.write(buffer,0,bytes);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

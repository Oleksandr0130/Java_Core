package lesson_34.ClassCode;

import java.io.*;

public class Hw34 {
    public static void main(String[] args) {
        String inputFile = "D:/333/file.dat";

        File inputData = new File(inputFile);
        if(!inputData.exists()){
            System.out.println("Отсутствует файл данных");
            System.exit(-1);
        }


        String[] outputFiles = {
                "D:/333/file1",
                "D:/333/file2",
                "D:/333/file3"
        };

        int[] filesSize = {601,57053,22494};


        try (
                FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream1 = new FileOutputStream(outputFiles[0]);
                FileOutputStream outputStream2 = new FileOutputStream(outputFiles[1]);
                FileOutputStream outputStream3 = new FileOutputStream(outputFiles[2])
        ){
            OutputStream[] os = {outputStream1,outputStream2,outputStream3};

            for (int i=0;i<3;i++){
                byte[] buffer = new byte[filesSize[i]];
                int bytes = inputStream.read(buffer);
                if (bytes != -1){
                    os[i].write(buffer,0,bytes);
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

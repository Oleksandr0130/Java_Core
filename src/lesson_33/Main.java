package lesson_33;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(OutputStream outputStream = new  FileOutputStream("1")) {
            outputStream.write(65);
            outputStream.write(66);
            outputStream.write(67);
            outputStream.write(10);
            outputStream.write(65);
            outputStream.write(66);
            outputStream.write(67);

        } catch (IOException e) {
            System.out.println("Что-то пошло не так...");

        }
        try (InputStream is = new FileInputStream("1")){
            int data;
            while ((data = is.read())!= -1){
                System.out.printf("%d",data);
            }
        }catch (IOException e){

        }
        }

    }


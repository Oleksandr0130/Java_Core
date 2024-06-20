package lesson_33;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        copy();
    }
    public static void copy(){
        try (InputStream is = new FileInputStream("d:\\szkola\\Лекции\\lesson36.mp4");
        OutputStream os = new FileOutputStream("d:\\szkola\\Лекции\\copyLesson36.mp4")){
            int count=0;
            int data;
            while ((data = is.read()) != -1){
                count++;
                if (count%100000 == 0){
                    System.out.println(count);
                }
                os.write(data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

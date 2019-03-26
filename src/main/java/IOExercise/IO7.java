package IOExercise;

import day02.Student;

import java.io.*;
//未完成，有疑问！！！！！！

//创建一个文件夹，分别向该文件夹下复制几个图片，文本文件和Java源程序
public class IO7 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\timg.jpg");
            FileWriter fileWriter = new FileWriter("D:\\SHY");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

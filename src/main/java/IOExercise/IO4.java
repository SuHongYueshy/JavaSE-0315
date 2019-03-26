package IOExercise;

import java.io.File;

//所编写的.java文件读出显示在屏幕上
public class IO4 {
    public static void main(String[] args) {
        File file = new File(".java");
        System.out.println(file.isFile());
    }
}

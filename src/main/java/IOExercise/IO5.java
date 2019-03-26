package IOExercise;

import java.io.File;

//列出某一目录下的所有Java文件
public class IO5 {
    public static void main(String[] args) {
        File file = new File("c:/");
        for (File temp : file.listFiles()) {
            if (temp.isFile()) {
                System.out.println(temp.toString());
            }
        }
    }
}

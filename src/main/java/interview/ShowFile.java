package interview;

import java.io.File;

public class ShowFile {
    public static void main(String[] args) {
       /* File file = new File("d:/中国共产党");    所有文件的代码
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile())
                System.out.println(files[i]);
        }*/
        /*File file = new File("d:/中国共产党");   所有子目录
            File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory())
                System.out.println(files[i]);
        }*/
        System.out.println(new File("d:/苏宏月.dco").exists());
    }
}

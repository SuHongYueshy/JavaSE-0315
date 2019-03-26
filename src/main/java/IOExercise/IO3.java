package IOExercise;

import java.io.FileWriter;
import java.io.IOException;

// 向文本文件中写入自己的信息，格式为：
//        姓名：tester
//        性别：male
//        年龄：18
//        班级：201601
public class IO3 {
    public static void main(String[] args) {
        StringBuffer file = new StringBuffer();
        file.append("姓名：tester\n");
        file.append("性别：male\n");
        file.append("年龄：18\n");
        file.append("班级：01601\n");
        try{
            FileWriter fileWriter = new FileWriter("d:/SHY/shy.txt");
            fileWriter.write(file.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

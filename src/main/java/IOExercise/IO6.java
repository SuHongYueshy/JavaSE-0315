package IOExercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//将C盘的某一文件复制到D盘
 /*1.C盘的文件是一个数据的源
  * 复制到的D盘，说明D盘是数据的存储的目的，该目的中应该有一个文件
  * 2.先读取C盘的文件，将读取奥的数据写入到目的地中
  * 3.既然是操作文本文件，只要使用字符流即可。*/
public class IO6 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("c:/123");
            FileWriter fileWriter = new FileWriter("d:");

            int ch = 0;
            while ((ch = fileReader.read()) != -1) {
                fileWriter.write(ch);

                fileReader.close();
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
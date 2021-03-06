package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 输入流
 * Reader -> FileReader -> method
 */

public class InputStreamTest {

    private static final String NAME = "src/main/java/day05/InputStreamTest.java";

    public static void main(String[] args) {
        //InputStream inputStream = new InputStream();     会报错，因为InputStream是抽象的，不能被实例化
        try {
            InputStream inputStream = new FileInputStream(NAME);
            int i = inputStream.read();
            while (i != -1){
                System.out.print((char)i);
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

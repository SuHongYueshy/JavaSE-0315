package JavaText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Words {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/file.txt"))) {
            File file = new File("file.txt");
            char[] chars = new char[(int) file.length()];
            int number = bufferedReader.read(chars, 0, (int) file.length());
            System.out.println("read " + number + " characters.");
            for (int i = 0; i < chars.length; i++) {
                if (!String.valueOf(chars[i]).matches("[A-Za-z]{1}")) { // 正则：任意一个字母
                    chars[i] = ' ';
                }
            }
            String text = new String(chars);
            System.out.println(text);
            String[] words = text.split("\\s+"); // 正则：至少一个空格
            System.out.println("total words: " + words.length); // 正确结果 165； 只按空格 154
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

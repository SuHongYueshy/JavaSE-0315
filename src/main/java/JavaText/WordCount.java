package JavaText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("1.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("hello world, hello java.");
        pw.println("hello program, hello java.");
        pw.close();
        printWords(file);
    }
    public static void printWords(File file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Map<String, Integer> map = new LinkedHashMap<>();
        while (br.ready()) {
            Matcher matcher = pattern.matcher(br.readLine());
            while (matcher.find()) {
                String word = matcher.group();
                if (!map.containsKey(word)) {
                    map.put(word, 0);
                }
                map.put(word, map.get(word) + 1);
            }
        }
        br.close();
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}

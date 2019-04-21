package day03;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();

        strings.add("orange");
        strings.add("apple");
        strings.add("banana");

        strings = (TreeSet<String>) strings.descendingSet();   //按降序进行迭代

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
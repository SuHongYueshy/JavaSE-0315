package day03;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Vector;

public class ListTest {
    public static void main(String[] args) {
        // Shift + Ctrl + Alt + U
//        ArrayList
        LinkedHashSet

        ArrayList<String> strings = new ArrayList<>();

        strings.add("hello");
        strings.add("hi");

        System.out.println(strings.size());

        System.out.println(strings.get(0));
        for (String string : strings){
            System.out.println(string);
        }
        // 获取 ArrayList 的当前容量？
//        System.out.println(strings.capacity()); //

        Vector<Integer> integers = new Vector<>();
        System.out.println(integers.capacity());
    }
}
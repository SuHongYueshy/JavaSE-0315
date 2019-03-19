package day03;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();// new 一个vector<string>类型的对象,用无参数初始化这个对象,使这个新对象可以装个string.返回值也是:vector<string >
        // add

        for (int i = 0; i < 10; i++) {
            strings.add("hello");
        }

        strings.add("hi");
        System.out.println(strings.size()); //size大小   11

        // get
       // System.out.println(strings.get(0));

        System.out.println(strings.capacity()); // capacity: 容量    20

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}

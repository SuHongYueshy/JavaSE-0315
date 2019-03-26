package interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraySet{
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String egg = iterator.next();
            System.out.println(egg);
        }
    }
}
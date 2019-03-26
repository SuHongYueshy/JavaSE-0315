package interview;

import java.util.ArrayList;

public class CleanArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = list.size()-1 ; i >= 0 ; i--) {
            list.remove(i);
        }
        System.out.println(list);
    }
}

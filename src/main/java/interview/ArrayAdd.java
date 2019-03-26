package interview;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdd{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Black");
        for (int i = 0; i< names.size(); i ++){
            String string = names.get(i);
            System.out.println(string);
        }
    }

 }

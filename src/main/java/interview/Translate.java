package interview;

import java.util.HashMap;
import java.util.Map;

public class Translate {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("January","一月");
        map.put("February","二月");
        map.put("March","三月");
        String string = "July";
        if (map.containsKey(string)){
            System.out.println(string);
        }else{
            System.out.println("未查找该单词！");
        }
    }
}

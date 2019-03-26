package interview;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ZhangSan",89);
        map.put("LiSi",98);

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry: entrySet){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

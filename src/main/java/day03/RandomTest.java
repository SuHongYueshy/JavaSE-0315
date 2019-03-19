package day03;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

//随机生成[1， 20]数10000次，使用两种方法实现
// （java.lang.Math，java.util.Random），并判断两种方法的效率和分布。
public class RandomTest {

    private static final int COUNT = 10000;
private static Hashtable<Integer,Integer> hashtable;

private static void Init(){
    hashtable = new Hashtable<>();
    for (int i = 0; i < 20; i++) {
        hashtable.put(i + 1,0);
    }
}

    private static void mathTest(){
        Init();
        for (int i = 0; i < COUNT; i++) {
            int r = (int) (Math.random() * 20) + 1;
            hashtable.put(r, hashtable.get(r) + 1);
          //  System.out.println(r);
        }
        for(Map.Entry<Integer,Integer> entry : hashtable.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    private static void randomTest(){
        Init();//每次开始时初始化一下
        for (int i = 0; i < COUNT; i++) {
            Random random = new Random();
            int r = random.nextInt(20) + 1;
            hashtable.put(r, hashtable.get(r) + 1);
           // System.out.println(r);
        }
        for(Map.Entry<Integer,Integer> entry : hashtable.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public static void main(String[] args) {
// long start = System.nanoTime();
        long start = System.currentTimeMillis();
        mathTest();
        System.out.println("------------------");
        randomTest();
   //     System.out.println(System.nanoTime() - start);
    }
}

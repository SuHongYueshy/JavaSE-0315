package day03;

import java.util.Random;

//随机生成[1， 20]数10000次，使用两种方法实现
// （java.lang.Math，java.util.Random），并判断两种方法的效率和分布。
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random(20);
        for(int i = 1; i <= 20; i++){
            int num = random.nextInt(20);
              System.out.println( random );
        }
        System.out.println();
        //  Math.round(Math.random()*20);
    }
}

package day04;

public class BoxTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();  // 返回当时的计算机时

        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
            }
        System.out.println(sum);

        System.out.println(System.currentTimeMillis() - start);
    }
}

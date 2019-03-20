package day04;

public class ExceptionTest {
    // Runtime
    public static void main(String[] args) {
//        System.out.println(1/0);                //ArithmeticException   数字异常
//        System.out.println("hello".charAt(5));   //StringIndexOutOfBoundsException字符串下标越界异常
//        System.out.println(new int[]{1,2,3}[3]); //ArrayIndexOutOfBoundsException数组下标越界异常
//        System.out.println(Integer.parseInt("l23"));//NumberFormatException 数字格式化异常
        // NullPointerException NPE                //空指针异常
        String s = "hello";
        s = null;
        try {
//                System.exit(0);    当执行他时就结束了，后面的异常均不执行
//            System.out.println(s.length());
            System.out.println("in try block...");
        } catch (ArithmeticException e) {
            // ...
//            e.printStackTrace();
            System.out.println("NPE...");
        } finally {
            // ...
            System.out.println("always print...");
        }
        System.out.println("done.");
    }
}
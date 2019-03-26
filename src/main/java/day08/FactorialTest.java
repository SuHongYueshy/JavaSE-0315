package day08;

//求1+2!+3!+…+20!的和。
//
//利用递归方法求5!。
//f(1) = 1
//f(5) = 5*4*3*2*1
//f(n) = n * f(n-1)
public class FactorialTest {
    private static int factorial (int n){
       if (n ==1){
           return 1;
       }
       return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum += factorial(i + 1);
        }
        System.out.println(sum);
    }
}

package day01;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        double x = 1.0;
        double y =  0.99;

        double z = x - y;

        System.out.println(z);

        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));

        z = a.subtract(b).doubleValue();    // 进行减法运算时，加doubleValue（）可以避免损失精度

        System.out.println(z);
    }
}

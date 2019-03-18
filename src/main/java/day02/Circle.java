package day02;

import java.io.PipedOutputStream;
//将圆周率定义为常量，编写一个求圆面积的方法，调用此方法来求圆的面积
public class Circle {
    static double r;

    double getArea(){
        return 0d;
    }

    public static void main(String[] args) {
        double r =4;
      //  System.out.println(Math.PI);
        System.out.println("圆的面积为：" + Math.PI*r*r);;
    }
}

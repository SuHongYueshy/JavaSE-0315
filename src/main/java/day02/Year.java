package day02;

import java.util.Scanner;

// 思路：
//定义一个判断闰年的方法，在 main 方法中调用该方法判断输入的一个年份是否是闰年
// 1. 每次出现的数据是不一定的
// 2. if-else 语句
// 3. 能整除4且不能整除100且能整除400的就是闰年
public class Year {
    public static boolean isLeapYear(int year) {
        /*if ((year / 4 == 0 && year / 100 != 0) || (year / 400 == 0)) {
            System.out.println("是闰年！");
        } else {
            System.out.println( "是平年！");

        }*/
        return year % 4 == 0 || (year % 400 == 0 && year % 100 != 0);
    }

        public static void main (String [] year){
            // 年份输入
            Scanner scanner = new Scanner(System.in);
            System.out.println("Intput year:");
            int Year = scanner.nextInt();
           // Year years = new Year();
           // System.out.println(year);
            System.out.println(year + "is leap year:" + isLeapYear(Year));
        }
    }


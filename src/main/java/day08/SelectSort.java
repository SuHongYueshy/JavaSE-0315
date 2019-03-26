package day08;

import sun.text.resources.cldr.yav.FormatData_yav;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int [] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) ( Math.random() * 100 );
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0;i < ints.length - 1; i++) {
            for (int y = 0; y < ints.length; y++) {
                if (ints[i] > ints[y]){
                    int temp = ints[i];
                    ints[i] = ints[y];
                    ints[y] = temp;
                }
            }
        }
    }
}

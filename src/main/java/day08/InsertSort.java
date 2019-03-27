package day08;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int [] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) ( Math.random() * 100 );
        }
        System.out.println(Arrays.toString(ints));

            if(ints.length==1){
                return;
            }
            // 待插入数据
            int tmp;
            //遍历数组
            for(int i = 1; i < ints.length; i++) {
                // 待插入数据
                tmp = ints[i];
                int j;
                //遍历已排序的数组
                for(j = i - 1; j >= 0; j--) {
                    // 判断是否大于tmp，大于则后移一位
                    if(ints[j] > tmp) {
                        ints[j+1] = ints[j];
                    }else{
                        break;
                    }
                }
                //把插入的数据放到正确的位置
                ints[j+1] = tmp;
                System.out.println("第" + i + "次" + ":" + Arrays.toString(ints));
            }
        }
    }
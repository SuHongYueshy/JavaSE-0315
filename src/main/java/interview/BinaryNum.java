package interview;
/*思路：
* 1.计算二进制中1的个数
* N为奇数，二进制中的1的个数=N/2个
* */
public class BinaryNum {
    public static void main(String[] args) {
        int num = 13;
    }
    public static int getBinary(int num){
        if (num == 1)
            return 1;
        if(num % 2 == 0) {  //是否为偶数
            return getBinary(num / 2);
        }else{
            return getBinary(num / 2)+ 1;
        }
    }

}

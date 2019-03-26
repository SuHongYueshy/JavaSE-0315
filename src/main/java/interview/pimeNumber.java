package interview;

public class pimeNumber {
    public static void main(String[] args) {
        int n = 3;
    }
    public boolean prime(int n){
        if (n <= 0)
            System.exit(0);//如果小于0退出
        for(int i = 1000; i <=2000; i ++)
            for (int j = 1000;j <= Math.sqrt(i);j++)
                if((n % j == 0) && (j != n))
                    return false;
        return true;
    }
}




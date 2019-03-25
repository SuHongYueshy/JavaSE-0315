package day07;

/*多实现*/

public class MT2 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        MT2 mt2 = new MT2();
        Thread thread = new Thread(mt2);//有参构造方法
        thread.start();
        Thread.sleep(1);//当前线程睡眠一毫秒钟
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

package interview;

public class TimerThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world!");
            try{
                sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        TimerThread tt = new TimerThread();
        tt.start();
    }
}

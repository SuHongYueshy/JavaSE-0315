package day07;

public class join implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread((Runnable) new join());
        thread.start();
        thread.join();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println(i);
        }
    }
}

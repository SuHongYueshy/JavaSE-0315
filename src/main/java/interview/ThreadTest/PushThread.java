/*
package interview.ThreadTest;

import com.sun.org.apache.bcel.internal.generic.StackInstruction;

import java.util.Random;

//生产者线程
public class PushThread implements Runnable {
    private StackInstruction s;

    public PushThread(StackInstruction s) {
        this.s = s;
    }
    public void run() {
        int i = 0;
        while (true) {
            java.util.Random r = new java.util. Random();
            i = r.nextInt(10);
            s.push(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

*/

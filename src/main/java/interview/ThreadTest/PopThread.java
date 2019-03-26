package interview.ThreadTest;

import com.sun.org.apache.bcel.internal.generic.StackInstruction;

//消费者线程
public class PopThread implements Runnable{
private StackInstruction s;
public PopThread(StackInstruction s){
    this.s = s;
}
    @Override
    public void run() {
    while(true){
        //System.out.println("->" + s.pop()[0] + "<-");
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){}
    }
    }
}

package interview.ThreadTest;

//实现生产和消费的过程

import com.sun.org.apache.bcel.internal.generic.StackInstruction;
import com.sun.org.apache.bcel.internal.generic.Visitor;

public class SafeStack extends StackInstruction implements StackInterface{
private int top = 0;

private int[] values = new int[20];  //枪膛对象
    private boolean dataAvailable = false;

    /**
     * @param opcode instruction opcode
     */
    protected SafeStack(short opcode) {
        super(opcode);
    }

    @Override
    public void push(int n) {
        synchronized(this){
            while (dataAvailable){
                try{
                    wait();
                }catch (InterruptedException e){
                }
            }
            values[top] = n;
            System.out.println("压入数字" + n + "步骤1完成！");
            top++;
            dataAvailable = true;
            notifyAll();
            System.out.println("压入数字完成！");
        }
    }

    @Override
    public int[] pop() {
        synchronized (this){
            while (!dataAvailable){
                try{
                    wait();
                }catch (InterruptedException e){}
            }
        }
        System.out.print("弹出！");
        top--;
        int[] test = { values[top], top};
        dataAvailable = false;
        // 唤醒正在等待压入数据的线程
        notifyAll();
        return test;
    }

    @Override
    public void accept(Visitor v) {

    }
}

package interview;

//写出线程的实现方式
//方式一：继承于Thread类

public class Person1 extends Thread{
        public static void main(String[] args) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("做弹弓子打你家玻璃！");
                }
            System.out.println("弹弓子over!");
        }
         public void run(){
        System.out.println(this.getName() + "," + this.getId());
         }
    }


    //方法二：创建一个类实现Runnable接口，重写run方法以实现Runnable接口的方法

/*public class Person1 implements Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("做弹弓子打你家玻璃！");
        }
        System.out.println("弹弓子over!");
        }
    public void run(){
        System.out.println(this.getName() + "," + this.getId());
    }
}*/


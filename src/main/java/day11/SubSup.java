package day11;

public class SubSup {

    public static void main(String[] args) {
        Sub sub = new Sub(1);  //创建或生成一个类的对象，总是调用类的构造方法
        sub.m();
    }
}

class Sup{
    private int i ;
    public Sup (){
        System.out.println("Sup constructor...");
    }
    public Sup(int i){
        this.i = i;   //指代当前类
    }

    protected void m(){
        System.out.println("Sup method...");
    }
}

class Sub extends Sup{
public Sub(int i){
      //super();  //  隐藏起来的内容
    String s = "hello";
}

public void m(){
    super.m();
    System.out.println("Sub method...");
}
//类加载顺序
//父类静态代码块内容 - 子类静态代码块内容 - 父类构造器块 - 父类构造器 - 子类构 造器块 - 子类构造器
}

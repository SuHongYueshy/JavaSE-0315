package day02;

public class StaticTest {
    public static void main(String[] args) {
Mankind tom = new Mankind("Tom", 19);

tom.setAge(20);
        System.out.println(tom.getName());
        System.out.println(tom.getAge());

        // tom.setEarth("Tom 在天软种了一棵树。");
        Mankind.setEarth("Tom 在天软种了一棵树。");//静态类与名称无关

        System.out.println(Mankind.getEarth()); // 第一次直接输出的话是：null

        Mankind jerry = new Mankind("jerry", 18);

        jerry.setName("Jerry");
        System.out.println(jerry.getName());
        System.out.println(jerry.getAge());

        System.out.println(Mankind.getEarth()); // null

//        Math math = new Math();
//                   static int = 0;
        System.out.println(Math.PI);//Math.PI和Math.e可以直接输出，不用实参定义
        System.out.println(Math.pow(2,3));
    }
}
class Mankind{

    private String name;
    private int age;

    //static field
    private static String earth;//设置为静态后，一个对象设置完这个后，之后另一个对象输出他时结果是之前设置的

    public Mankind(String name,int age){
this.name = name;
this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public static String getEarth() {
        return earth;
    }

    public static void setEarth(String earth) {
        Mankind.earth = earth;
    }

    public void setAge(int age) {
        this.age = age;

    }
}

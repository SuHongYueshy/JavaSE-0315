package day02;

//class = fields + methods  类 = 域 + 方法
public class Human {
private String name;
private int age;
private double height;
private boolean married;

public Human(){

}

static{
    // static block    静态块
}

    {
        // constructor block   构造器块
        int i = 0;
    }

    public Human(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;

    }

    public void study(int hours){
        System.out.println(name + "study" + hours + "hours.");
    }

    public void work(){

    }
}

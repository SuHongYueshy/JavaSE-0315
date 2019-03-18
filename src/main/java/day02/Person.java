package day02;
//定义一个人类，包含姓名、性别、年龄等信息。所有的变量必须私有。
// 其他类只能通过该类的方法获取和修改。
// 实例化一个人类，试着通过该类的方法修改实例化的人的信息

//修改上次写的人类，使它有多个构造方法，可以用姓名构造一个人，也可以用姓名，性别构造一个人
public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void study(int hours) {
        System.out.println(name + " is study " + hours + " hours.");
    }

    void work(int days) {
        System.out.println(name + " is work " + days + " days in this month.");
    }
}

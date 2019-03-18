package day02;

import java.util.Scanner;

//定义一个学生类，包含三个属性（学号，姓名，成绩）均为私有的，
// 分别给这三个属性定义两个方法，一个设置它的值，另一个获得它的值。
// 然后在一个测试类里试着调用
public class Student {
    private String Sno;
    private String Name;
    private double Grade;

    public Student(){

    }

    public Student(String sno, String name, double grade) {
        Sno = sno;
        Name = name;
        Grade = grade;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double grade) {
        Grade = grade;
    }

    /*  输入学号
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input sno:");
        int sno = scanner1.nextInt();
        Student student1 = new Student();
        System.out.println(sno);

        输入姓名
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner2.nextString();
        Student student2 = new Student();
        System.out.println(name);

        输入成绩
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Input sno:");
        int grade = scanner3.nextInt();
        Student student = new Student();
        System.out.println(grade);
    }*/


}

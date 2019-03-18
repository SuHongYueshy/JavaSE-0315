package day02;

import javax.swing.colorchooser.AbstractColorChooserPanel;

//创建一个汽车类 Car，为其定义两个属性：颜色和型号，
// 为该类创建两个构造方法： 第一个为无形参的构造方法，利用其中方法将颜色和型号设置为红色、轿车 。
// 第二个为带参构造方法，利用构造方法将颜色和型号设置为黑色、轿车，
// 另外为该类创建两个方法，分别用来显示颜色和型号
public class Car {
    private String color;
    private String type;

    public Car(){
this.color = null;
this.type = null;
    }
    public Car(String color,String type ){
this.color = color;
this.type = type;
    }
    //显示颜色
    public void PrintColor(){
        System.out.println (color);
    }
    //显示型号
    public void PrintType(){
        System.out.println(type);
    }
}

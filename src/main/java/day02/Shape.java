package day02;
//思路：
//编写一个立方体类，包含这样的属性：长度、宽度、高度等信息，通过方法来计算它的体积
// 1.域有长、宽、高等
// 2.方法是面积= 长*宽，体积=长*宽*高
// 3.出现几个图形继承Shape

public class Shape {
    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3);
        System.out.println(cube.getVolume());
    }
}
    class Cube {

    private int length;
    private int width;
    private int height;
public Cube (int length,int width,int height){
    this.length = length;
    this.width = width;
    this.height = height;
        }

    public int getVolume() {  //体积
        return length * width * height;
    }
}




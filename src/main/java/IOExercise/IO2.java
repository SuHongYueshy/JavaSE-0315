package IOExercise;

//查看刚才所创建的文件的属性：
// 包括是否能读、写、相对路径、绝对路径、长度,最后修改时间等
import java.io.File;
import java.util.Date;

public class IO2 {
    public static void main(String[] args) {
        File file = new File("d:/SHY/shy.txt");
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));
    }
}

package day06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        // File：文件 或 目录
        File file1 = new File("README.md");
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
    //  System.out.println(file1.delete());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.getUsableSpace()/1024/1024/1024);  //可用空间
        System.out.println(file1.getTotalSpace()/1024/1024/1024);  //总共空间


        File file2 = new File(".git");
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isHidden());
        System.out.println(new Date(file1.lastModified()));// 更新时间
        System.out.println(file1.length());  // 输出文件的大小
        System.out.println(Arrays.toString(file2.list()));

        file1.renameTo(new File("new_writer.txt"));
        
        File c = new File("c:/");
        System.out.println(Arrays.toString(c.list()));
    }
}

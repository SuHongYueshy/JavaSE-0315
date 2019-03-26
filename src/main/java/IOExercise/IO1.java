package IOExercise;

import java.io.File;
import java.io.IOException;

public class IO1 {
    public static void main(String[] args) {
        createFile();
    }

    private static void createFile() {
        String path = "d:/SHY";
        File f = new File(path);
        if (!f.exists()){
            f.mkdirs();
        }
        String fileName = "shy.txt";
        File file = new File(f,fileName);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

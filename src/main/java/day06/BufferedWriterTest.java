package day06;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class BufferedWriterTest {
    private static int lenght;

    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("README.md"))) {
            for (int i = 0; i < lenght; i++) {
               bufferedWriter.write(i+"abc");
               bufferedWriter.newLine();
               bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

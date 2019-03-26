package interview;

import java.io.*;

//写一个方法，输入一个文件名和一个字符串，
// 统计这个字符串在这个文件中出现的次数
public class StatisticsNum {
   /* public static void main(String[] args) throws IOException {
        public int countWords(String file,String find) throws Exception{
            int count = 0;
            Reader in = new FileReader(file);
            int c;
            while ((c = in.read()) != -1){
                while (c == find.charAt(0)){
                    for (int i = 1; i < find.lenght; i++) {
                        c = in.read();
                        if (c != find.charAt(i))
                            break;
                        if (i == find.length() -1)
                            count++;
                    }
                }
            }
            return count;
        }
    }*/
    /**
     * 写入一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数。
     * @param fileName 文件名
     * @param str 查找的字符串
     * @return
     * @throws Exception
     */
    public int selectCountInfile(String filename,String str) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

        StringBuilder readLine=new StringBuilder();
        String line;
        /**
         * BufferedReader的readLine()方法用来读一行文字， 一行被视为由换行符（'\ n'），回车符（'\ r'）中的任何一个或随后的换行符终止
         */
        while((line=br.readLine())!=null) {
            readLine.append(line);//把读到的一行文字追加到StringBuilder字符串中
        }
        int index;int count = 0;
        /**
         * StringBuilder的indexOf(string类型)方法：返回指定子字符串第一次出现的字符串内的索引
         * 如果字符串参数作为该对象中的子字符串发生，则返回第一个这样的子字符串的第一个字符的索引; 如果它不作为子串发生，则返回-1
         */
        while ((index=readLine.indexOf(str))!=-1) {
            /**
             * 删除此序列的子字符串中的字符
             */
            readLine.delete(index, index+str.length());
            count++;
        }
        return count;

    }
}


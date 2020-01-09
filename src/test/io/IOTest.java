package test.io;

import java.io.*;

/**
 * @author guoshoujing
 * @create 2019-12-30 2:27 下午
 */
public class IOTest {
    public static void main(String[] args) throws Exception{
        String fileName = "test";
        InputStream inputStream = new FileInputStream("/Users/guoshoujing/IdeaProjects/gaosi/LeetCode/src/test/io/test");
        OutputStream outputStream = new FileOutputStream("/Users/guoshoujing/IdeaProjects/gaosi/LeetCode/src/test/io/test");

        for(int i = 0 ; i < 20; i++){
            outputStream.write(i);
        }
        int b;
        while((b = inputStream.read()) != -1){
            System.out.println(b);
        }

    }
}

package javaBase.test;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //public static void main(String[] args) {
    //    int a = byteArrayToInt(new byte[]{5, 0, 0, 0});
    //    byte[] bytes = intToByteArray(a);
    //}

    public static void main(String[] args) throws IOException  {
        String path = Paths.get("dir", "d1", "d2").toString();
        System.out.println(path);
    }

    public static class SleepUtil {

        public static void sleep(long time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int byteArrayToInt(byte[] bytes) {
        return bytes[0] & 0xFF |
               (bytes[1] & 0xFF) << 8 |
               (bytes[2] & 0xFF) << 16 |
               (bytes[3] & 0xFF) << 24;
    }

    public static byte[] intToByteArray(int data) {
        return new byte[] {
                (byte) ((data >> 24) & 0xFF),
                (byte) ((data >> 16) & 0xFF),
                (byte) ((data >> 8) & 0xFF),
                (byte) (data & 0xFF)
        };
    }
}

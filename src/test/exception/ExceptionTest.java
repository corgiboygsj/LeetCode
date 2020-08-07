package test.exception;

import java.io.*;
import java.util.Objects;

/**
 * @author guoshoujing
 * @create 2020-06-22 9:01 下午
 */
public class ExceptionTest {
    public static void main(String[] args) {
        //try-with-recourse和multi-catch示例
        //资源类实现CloseAble或者AutoCloseAble接口就会自动的在最后调用close方法
        //multi-catch在不同异常相同处理方案时可以使用
//        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("name"));
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("name"))) {
//            bufferedInputStream.read();
//        } catch (NullPointerException | IOException a) {
//            a.printStackTrace();
//        }

        //尽早抛出、延迟捕获
        //下面a方法就会在实际使用到name这个属性的时候报空指针异常，位置是在FileInputStream类的里面报出的。
        //而我们想要的是尽早抛出，也就是在业务代码中就进行判断。下面c换成d方法，就会在更早的地方进行判断并且抛出异常
        a(null);
    }

    public static void a(String name){
        b(name);
    }

    public static void b(String name){
        c(name);
    }

    public static void c(String name){
        try(FileInputStream fileInputStream = new FileInputStream(name);) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void d(String name){
        Objects.requireNonNull(name);
        try(FileInputStream fileInputStream = new FileInputStream(name);) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

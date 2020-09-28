package javaBase.proxy;

/**
 * @author guoshoujing
 * @create 2020-06-28 9:38 下午
 */
public class MyClass implements MyInterface {
    @Override
    public void saySomething(String msg) {
        System.out.println("say:" + msg);
    }

    @Override
    public void doSomething(String msg) {
        System.out.println("do:" + msg);
    }
}

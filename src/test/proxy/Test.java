package test.proxy;


import test.proxy.dynamicProxy.TimeHandler;

/**
 * @author guoshoujing
 * @create 2020-06-28 9:43 下午
 */
public class Test {
    public static void main(String[] args) {
        TimeHandler timeHandler = new TimeHandler(new MyClass());

        MyInterface proxy = (MyInterface)timeHandler.getProxy();
        proxy.saySomething("hello");
        proxy.doSomething("homework");
    }
}

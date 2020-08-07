package test.proxy.staticProxy;

import test.proxy.MyInterface;

/**
 * @author guoshoujing
 * @create 2020-06-28 9:40 下午
 */
public class MyProxy implements MyInterface {
    private MyInterface myInterface;

    public MyProxy(MyInterface myInterface){
        this.myInterface = myInterface;
    }

    @Override
    public void saySomething(String msg) {
        long beginTime = System.currentTimeMillis();

        myInterface.saySomething(msg);

        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - beginTime));
    }

    @Override
    public void doSomething(String msg) {
        long beginTime = System.currentTimeMillis();

        myInterface.doSomething(msg);

        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - beginTime));
    }
}

package test.proxy.staticProxy;

import test.proxy.MyInterface;

/**
 * @author guoshoujing
 * @create 2020-06-28 9:46 下午
 */
public class MyInterfaceProxyFactory {
    public static MyInterface getInstance(MyInterface myInterface){
        return new MyProxy(myInterface);
    }
}

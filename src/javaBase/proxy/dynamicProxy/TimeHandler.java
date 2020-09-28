package javaBase.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author guoshoujing
 * @create 2020-06-28 10:14 下午
 */
public class TimeHandler implements InvocationHandler {
    private Object obj;

    public TimeHandler(Object obj){
        this.obj = obj;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long beginTime = System.currentTimeMillis();

        //反射调用代理类的方法，其他代码为增强逻辑
        Object invoke = method.invoke(obj, args);

        long endTime = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() + ":" + method.getName() + "方法---耗时：" + (endTime - beginTime));

        return invoke;
    }
}

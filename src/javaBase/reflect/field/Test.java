package javaBase.reflect.field;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author guoshoujing
 * @create 2020-09-28 5:08 下午
 */
public class Test {
    public void test(){

    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class<Test2> clazz = Test2.class;
//        Field[] declaredField = clazz.getDeclaredFields();
//        for (Field field :
//                declaredField) {
//            System.out.println(field.getName());
//        }
//
//        System.out.println("-------------");
//        Field[] fields = clazz.getFields();
//        for (Field field :
//                fields) {
//            System.out.println(field.getName());
//        }
//
//        System.out.println("-------------");
//        Test2 test = clazz.getConstructor().newInstance();
//
//        Field name = clazz.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(test, "123");
//        Field age = clazz.getDeclaredField("age");
//        age.setAccessible(true);
//        age.set(test, 1);
//
//        System.out.println(JSON.toJSONString(test));
//
//        System.out.println("-------------");
//
//        test.t(new Test2());
//        test.t(new Object());

        Class<Test> testClass = Test.class;
        Method main = testClass.getMethod("main", String[].class);
        System.out.println(main.getDeclaringClass().getName());

        testClass.getDeclaredField("123");
    }
}

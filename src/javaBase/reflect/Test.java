package javaBase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author guoshoujing
 * @create 2020-06-28 9:33 上午
 */
public class Test {
    public static class User{
        private final String finalName = "finalName";
        private String name;
        private Integer age;

        public String getFinalName(){
            return finalName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = User.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println("方法名：" + method.getName());
            Parameter[] parameters = method.getParameters();
            for(Parameter parameter : parameters){
                System.out.println("参数类型：" + parameter.getType().getName() + "参数名称：" + parameter.getName());
            }
        }

        User user = new User();
        System.out.println(user.getFinalName());
        Field finalName = clazz.getDeclaredField("finalName");
        finalName.setAccessible(true);
        finalName.set(user, "guoshoujing");
        System.out.println(user.getFinalName());
    }
}

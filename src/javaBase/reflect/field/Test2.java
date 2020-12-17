package javaBase.reflect.field;

/**
 * @author guoshoujing
 * @create 2020-09-28 5:20 下午
 */
public class Test2 {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    @Ta(type = Type.WARNING)
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void t(Object test){
        System.out.println("test Object");
    }

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
    }
}

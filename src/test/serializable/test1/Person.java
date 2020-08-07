package test.serializable.test1;

import java.io.Serializable;

/**
 * @author guoshoujing
 * @create 2020-07-20 9:51 下午
 */
public class Person implements Serializable {
    private Integer age;
    private String name;
    private Integer height;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}

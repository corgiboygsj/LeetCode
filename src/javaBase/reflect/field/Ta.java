package javaBase.reflect.field;

import java.lang.annotation.*;

/**
 * @author guoshoujing
 * @create 2020-09-28 7:00 下午
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ta {
    Type type();
}

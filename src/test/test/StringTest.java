package test.test;

/**
 * @author guoshoujing
 * @create 2020-06-24 11:02 上午
 */
public class StringTest {
    public static void main(String[] args) {
        b();
    }

    public static void a(){
        //true true true
        String c = "ab";    //在常量池创建字符串ab
        String i = "a" + "b"; //编译器直接优化成i = "ab"，因为常量池存在ab所以直接返回ab的地址，所以c == i是true
        String j = i.intern();  //i.intern会检查i字符串在常量池是否存在，如果存在则返回常量池中该字符串地址，否则将字符串加入常量池并返回地址。
        System.out.println(c == i);
        System.out.println(i == j);
        System.out.println(c == j);
    }

    public static void b(){
        //两个string连接，在堆中生成一个String对象，该对象内部代表"12"
        String a = new String("1") + new String("2");
        //调用intern，因为1.8字符串常量池移入到heap中，所以直接返回a对象的地址而不需要在常量池新建对象。
        a.intern();
        //字面量"12"会直接返回a对象的地址
        String b = "12";
        System.out.println(a == b);
    }

    public static void c(){
        //false false true
        String c = "ab";
        String i = new String("a") + new String("b");
        String j = i.intern();
        System.out.println(c == i);
        System.out.println(i == j);
        System.out.println(c == j);
    }

    public static void d(){
        //false false true
        String c = "ab";
        String i = new String("ab");
        String j = i.intern();
        System.out.println(c == i);
        System.out.println(i == j);
        System.out.println(c == j);
    }

    public static void e(){
        //false false true
        String c = "ab";
        String b = "b";
        //变量连接通过jvm生成stringbuilder进行连接，返回新的String对象，对象在堆中
        String i = "a" + b;
        String j = i.intern();
        System.out.println(c == i);
        System.out.println(i == j);
        System.out.println(c == j);
    }

    public static void f(){
        String a = new String("guo").intern();
        System.out.println(a == "guo");
    }
}

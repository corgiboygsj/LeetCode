package javaBase.collections.arraylist;

/**
 * @author guoshoujing
 * @create 2020-04-01 2:20 下午
 */
public class ArrayListTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.setA(5);
    }

    private static class Test{
        private Integer a;

        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }
    }
}

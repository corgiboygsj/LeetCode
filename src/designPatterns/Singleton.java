package designPatterns;

import java.io.*;

/**
 * @author guoshoujing
 * @create 2020-08-07 3:59 下午
 */
public class Singleton implements Serializable{
    public static class TestClass implements Serializable{
        private volatile static TestClass instance;

        private static final sun.misc.Unsafe U;
        private static int flag;
        private static final long FLAG;

        static {
            try {
                U = sun.misc.Unsafe.getUnsafe();
                Class<?> c = TestClass.class;
                FLAG = U.objectFieldOffset(c.getDeclaredField("flag"));
            } catch (NoSuchFieldException e) {
                throw new Error(e);
            }
        }

        private TestClass(){
            if(U.compareAndSwapInt(this, FLAG, 0, 1)){

            }
        }

        public static TestClass getInstance(){
            if(instance == null){
                synchronized (TestClass.class){
                    if(instance == null){
                        instance = new TestClass();
                    }
                }
            }

            return instance;
        }

        private Object readResolve() throws ObjectStreamException {
            return TestClass.getInstance();
        }
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestClass instance1 = TestClass.getInstance();
        TestClass instance2 = TestClass.getInstance();

        File file = new File("ser.out");
        file.delete();
        file.createNewFile();

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        outputStream.writeObject(instance1);

        Object o = inputStream.readObject();
        System.out.println(instance1 == instance2);
        System.out.println(instance1 == o);
    }
}

package test.serializable.test1;

import java.io.*;

/**
 * @author guoshoujing
 * @create 2020-07-20 9:52 下午
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setPhone("18004351737a");
        teacher.setSex(1);

        File file = new File("/Users/guoshoujing/IdeaProjects/gaosi/LeetCode/src/test/serializable/test1/ser");

//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
//        outputStream.writeObject(teacher);
//        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Teacher t = (Teacher) inputStream.readObject();
        System.out.println(t.getId() + t.getAddress2());
        inputStream.close();
    }

}

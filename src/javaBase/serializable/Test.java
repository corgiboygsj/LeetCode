package javaBase.serializable;

import java.io.*;

/**
 * @author guoshoujing
 * @create 2020-08-10 10:22 上午
 */
public class Test implements Serializable {
    private Integer id;
    private String name;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{\"Test\":{"
                + "\"id\":"
                + id
                + ",\"name\":\""
                + name + '\"'
                + "}}";

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("ser.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));

        Test test = new Test();
        test.setId(1);
        test.setName("guo");

//        outputStream.writeObject(test);
//        outputStream.writeObject(1);

        Object o = inputStream.readObject();
        System.out.println(o.toString());
    }
}

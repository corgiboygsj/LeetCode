package test.serializable.test1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author guoshoujing
 * @create 2020-07-20 9:51 下午
 */
public class Teacher implements Serializable {
    private Integer id;
    private String phone;
    private String address2;

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    private transient Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private  void  writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(id);
        out.writeObject(phone);
    }
    private  void  readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.id = (Integer) in.readObject();
        this.address2 = (String) in.readObject();
    }
}

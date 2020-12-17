package javaBase.reflect.field;

/**
 * @author guoshoujing
 * @create 2020-09-28 7:04 下午
 */
public enum Type {
    WARNING(1, "警告"),
    SUCCESS(2, "成功");

    private Integer code;
    private String desc;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    Type(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}

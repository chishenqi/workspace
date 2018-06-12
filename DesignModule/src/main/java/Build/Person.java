package Build;

/**
 * Created by BG332387 on 2018/6/6.
 */
public class Person {

    private int id;
    private String name;
    private String passwd;
    private String sex;
    private String address;
    // 构造器尽量缩小范围
    private Person() {
    }

    // 构造器尽量缩小范围
    private Person(Person origin) {
        // 拷贝一份
        this.id = origin.id;
        this.name = origin.name;
        this.passwd = origin.passwd;
        this.sex = origin.sex;
        this.address = origin.address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public  static  Person getPerson(){
        return new Person();
    }


}

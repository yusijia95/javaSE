package practise.p01;

public class P01 {
    private String name;
    private String sex;

    public P01() {

    }

    public P01(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String toString() {
        return "名字" + name + "性别" + sex;
    }

}

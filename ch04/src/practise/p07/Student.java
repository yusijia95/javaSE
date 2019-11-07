package practise.p07;

public class Student {
    private int ID;
    private String name;
    private String sex;
    private int age;

    public Student(int ID) {
        this.ID = ID;
    }

    public Student() {
    }

    public Student(int ID, String name, String sex, int age) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}

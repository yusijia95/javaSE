package practise.p06;

public class Teacher {
    private int id;
    private String name;
    private String sex;
    private int age;
    private double height;

    public Teacher(int id, String name, String sex, int age, double height) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1 && name.length() < 4) {
            this.name = name;
        } else {
            System.out.println("请重新输入名字");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            System.out.println("请重新输入性别");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20 && age < 55) {
            this.age = age;
        } else {
            System.out.println("请重新输入年龄");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 1.50 && height < 1.80) {
            this.height = height;
        }else {
            System.out.println("请重新输入身高");
        }
    }

    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

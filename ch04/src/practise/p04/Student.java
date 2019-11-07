package practise.p04;

public class Student {
    private String name;
    private String sex;
    private int age;
    private String dire;

    public Student() {
    }

    public Student(String name, String sex, int age, String dire) {
        this.age = age;
        this.dire = dire;
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 4) {
            System.out.println("名字长度不能超过4个字，请重新输入");
        } else {
            this.name = name;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            System.out.println("性别只能为男女，请重新输入");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 60 || age < 1) {
            System.out.println("年龄只能为1-60，请重新输入");
        } else {
            this.age = age;
        }
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        if (dire.equals(".net") || dire.equals("java")) {
            this.dire = dire;
        } else {
            System.out.println("方向只能为.net或者java，请重新输入");
        }
    }

    public String toString() {
        return "学生姓名：" + name + "学生性别：" + sex + "学生年龄: " + age + "学生方向: " + dire;
    }
}

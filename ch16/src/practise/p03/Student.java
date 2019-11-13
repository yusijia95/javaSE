package practise.p03;

import java.io.Serializable;

public class Student implements Serializable,Comparable<Student> {
    private int number;
    private String name;
    private String password;
    private int age;
    private String grade;

    @Override
    public int compareTo(Student stu) {
        return stu.getAge()-this.getAge();
    }

    public Student() {
    }

    public Student(int number, String name, String password, int age, String grade) {
        this.number = number;
        this.name = name;
        this.password = password;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

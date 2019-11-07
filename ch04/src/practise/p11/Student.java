package practise.p11;

public class Student {
    private String name;
    private int age;
    private int number;
    public Class grade;

    public Student() {
    }

    public Student(String name, int age, int number, Class grade) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Class getGrade() {
        return grade;
    }

    public void setGrade(Class grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", grade=" + grade +
                '}';
    }
}

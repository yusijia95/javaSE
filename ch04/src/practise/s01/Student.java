package practise.s01;

public class Student {
    private int stuNum;
    private String name;
    private int stuScore;

    public Student() {
    }

    public Student(int stuNum, String name, int stuScore) {
        this.stuNum = stuNum;
        this.name = name;
        this.stuScore = stuScore;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", name='" + name + '\'' +
                ", stuScore=" + stuScore +
                '}';
    }
}

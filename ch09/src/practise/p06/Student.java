package practise.p06;

public class Student implements Comparable<Student> {
    private String name;
    private int chineseScore;
    private int englishScore;
    private int mathScore;

    @Override
    public int compareTo(Student stu){
        int sum= stu.chineseScore+stu.englishScore+stu.mathScore;
        int sub=sum - this.mathScore - this.englishScore - this.chineseScore;
        if(sub!=0) {
            return sub;
        }
        int subName=stu.name.compareTo(this.name);
            return subName;
    }

    public Student() {
    }

    public Student(String name, int chineseScore, int englishScore, int mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

}

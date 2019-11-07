package practise.s01;

public class Subject {
    private int subjectNum;
    private  String subjectName;
    private int score;

    public Subject() {
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public Subject(int subjectNum, String subjectName, int score) {
        this.subjectNum = subjectNum;
        this.subjectName = subjectName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectNum=" + subjectNum +
                ", subjectName='" + subjectName + '\'' +
                ", score=" + score +
                '}';
    }

    public int getSubjectNum() {
        return subjectNum;
    }

    public void setSubjectNum(int subjectNum) {
        this.subjectNum = subjectNum;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

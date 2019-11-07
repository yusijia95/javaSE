package practise.s01;

import java.util.Collection;
import java.util.List;

public class Student {
    private int studentNum;
    private String studentName;
    public List subjects;

    public Student() {
    }

    public Student(int studentNum, String studentName, List subjects) {
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List getSubjects() {
        return subjects;
    }

    public void setSubjects(List subjects) {
        this.subjects = subjects;
    }
}

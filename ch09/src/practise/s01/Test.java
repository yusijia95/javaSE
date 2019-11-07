package practise.s01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        List<Subject> list1 = new ArrayList<>();
        List<Subject> list2 = new ArrayList<>();
        List<Subject> list3 = new ArrayList<>();
        list1.add(new Subject("数学",100));
        list1.add(new Subject("语文",100));
        list1.add(new Subject("英语",100));
        list1.add(new Subject("物理",100));
        list1.add(new Subject("化学",100));
        list2.add(new Subject("语文",98));
        list2.add(new Subject("英语",98));
        list2.add(new Subject("数学",98));
        list2.add(new Subject("物理",98));
        list2.add(new Subject("化学",98));
        list3.add(new Subject("数学",99));
        list3.add(new Subject("语文",99));
        list3.add(new Subject("英语",99));
        list3.add(new Subject("物理",99));
        list3.add(new Subject("化学",99));
        list.add(new Student(111, "俞思笳1", list1));
        list.add(new Student(222, "俞思笳2", list2));
        list.add(new Student(333, "俞思笳3", list3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getStudentNum() + "   " + list.get(i).getStudentName());
            for (int j = 0; j < list.get(i).subjects.size(); j++) {
                System.out.println("    " + list.get(i).subjects.get(j).toString());
            }
        }
    }
}

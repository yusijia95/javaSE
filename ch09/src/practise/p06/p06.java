package practise.p06;

import java.util.Set;
import java.util.TreeSet;

public class p06 {
    public static void main(String[] args) {
        Set<Student> set= new TreeSet<>();
        set.add(new Student("俞思笳1",100,100,100));
        set.add(new Student("俞思笳2",98,100,100));
        set.add(new Student("俞思笳3",99,100,100));
        set.add(new Student("俞思笳4",97,100,100));
        set.add(new Student("俞思笳5",100,100,100));
//        System.out.println(set);
        for (Student stu:set) {
            System.out.println(stu);
        }
    }
}

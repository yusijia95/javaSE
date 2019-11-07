package practise.p02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P02 {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Student, Integer> map2 = new HashMap<Student, Integer>();
        map1.put(1, 1);
        map1.put(2, 2);
        map1.put(3, 3);
        map2.put(new Student("渔"), 1);
        map2.put(new Student("思"), 2);
        map2.put(new Student("加"), 3);
        Set<Integer> set1= map1.keySet();
        Set<Student> set2= map2.keySet();
        System.out.println(map1);
        System.out.println(map2);
        for (Integer in:set1) {
            System.out.println(in+"="+ map1.get(in));
        }
        for (Student stu:set2) {
            System.out.println(stu+"="+ map2.get(stu));
        }
    }

}

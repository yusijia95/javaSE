package example.e02;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<EnglishMan> treeSet=new TreeSet<EnglishMan>();
        treeSet.add(new EnglishMan("ab",97));
        treeSet.add(new EnglishMan("abc",97));
        treeSet.add(new EnglishMan("abc",96));
        treeSet.add(new EnglishMan("bcd",97));
        treeSet.add(new EnglishMan("abcd",97));
        for (EnglishMan man:treeSet) {
            System.out.println(treeSet);
        }
    }
}

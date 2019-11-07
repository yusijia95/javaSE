package example;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println("请输入人数：");
        Scanner type = new Scanner(System.in);
        int no = type.nextInt();
        Person[] arr = new Person[no];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Person();
        }
        for (int i = 0; i < no; i++) {
            System.out.println("请输入姓名：");
            arr[i].setName(type.next());
            System.out.println("请输入年龄：");
            arr[i].setAge(type.nextInt());
        }
        arr[0].quicksort(arr, 0, no - 1);
        for (int i = 0; i < no; i++) {
            System.out.println(arr[i].toString());
        }
        String female = Person.country;
    }
}

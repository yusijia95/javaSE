package practise.p01;

import java.util.Scanner;

public class function {
    static Scanner type = new Scanner(System.in);
    public static void add(){
        while (P02.arr[P02.count] != null) {
            P02.count++;
        }
        System.out.println("请输入添加成员姓名、性别");
        P02.arr[P02.count++] = new P01(type.next(), type.next());
        System.out.println("您输入的是" + P02.arr[P02.count-1].toString());
    }
    public static void set(){
        System.out.println("请输入修改人员位置信息：");
        P02.count = type.nextInt();
        System.out.println("请输入修改后人员姓名、性别");
        P02.arr[P02.count].setName(type.next());
        P02.arr[P02.count].setSex(type.next());
        System.out.println("您输入的是" + P02.arr[P02.count].toString());
    }
    public static void delete(){
        System.out.println("请输入需删除人员位置信息：");
        P02.count = type.nextInt();
        P02.arr[P02.count] = null;
        P02.count++;
        while (P02.arr[P02.count] != null) {
            P02.arr[P02.count - 1] = P02.arr[P02.count];
            P02.count++;
        }
    }
}

package summary.s07;

import java.util.List;
import java.util.Scanner;

public class StudentAdmin {
    public static String menu() {

        return "case 10：添加学生 " +
                "case 11:查找一个学生 " +
                "case 12:根据编号更新学生基本信息 " +
                "case 13:根据编号删除学生 " +
                "case 14:根据编号录入成绩 " +
                "case 15:根据某门成绩排序 " +
                "case 16:根据总成绩排序 " +
                "case 99:退出系统";
    }

    public static void intindex() {

    }

    public static String print(Student[] arr) {
        String str = "1";

        return str;
    }

    public static void create(int number, String name, int age, int python, int java, int linux, int sql, int sum, int avg) {
        Student student = new Student(number, name, age, python, java, linux, sql, sum, avg);
    }

    public static String select(List<Student> list, String name) {
        for (Student stu : list) {
            if (name.equals(stu.getName())) {
                return stu.toString();
            }
        }
        return "查无此人";
    }

    public static void update(List<Student> list, int number) {
        Scanner sca = new Scanner(System.in);
        for (Student stu : list) {
            if (number == stu.getNumber()) {
                stu.setName(sca.next());
                stu.setAge(sca.nextInt());
                stu.setLinux(sca.nextInt());
                stu.setPython(sca.nextInt());
                stu.setSql(sca.nextInt());
                stu.setJava(sca.nextInt());
                stu.setSum(sca.nextInt());
                stu.setAvg(sca.nextInt());
            }
        }
    }

    public static void delete(List<Student> list, int number) {
        for (Student stu : list) {
            if (number == stu.getNumber()) {
                list.remove(stu);
            }
        }
    }

    public static void input(List<Student> list, int number) {
        Scanner sca = new Scanner(System.in);
        for (Student stu : list) {
            if (number == stu.getNumber()) {
                stu.setLinux(sca.nextInt());
                stu.setPython(sca.nextInt());
                stu.setSql(sca.nextInt());
                stu.setJava(sca.nextInt());
                stu.setSum(sca.nextInt());
                stu.setAvg(sca.nextInt());
            }
        }
    }

    public static void courseSort(List<Student> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getJava() > list.get(j + 1).getJava()) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void sumSort(List<Student> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getSum() > list.get(j + 1).getSum()) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}


